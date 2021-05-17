package o09_reflection;

import java.io.IOException;

import com.google.common.reflect.ClassPath;

import o09_reflection.package01.InterfaceGeneric;

public class FindClasses {

  public static void main(String[] args) {

    final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    ClassPath classpath = null;
    try {
      classpath = ClassPath.from(loader);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (ClassPath.ClassInfo classInfo : classpath.getTopLevelClasses("findclassesinpackage.package01")) {
      InterfaceGeneric instanceOfClass;
      try {
        instanceOfClass = (InterfaceGeneric)classInfo.load().newInstance();
        instanceOfClass.imprimir();
      } catch (InstantiationException | IllegalAccessException e) {

      }
    }
  }

}
