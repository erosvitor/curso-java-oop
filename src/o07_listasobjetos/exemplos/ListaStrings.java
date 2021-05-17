package o07_listasobjetos.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaStrings {

  public static void main(String[] args) {
    
    String str;
    
    // Até o Java 1.4
    List list = new ArrayList();
    list.add("hello");
    list.add("hi");
    Iterator iter = list.iterator();
    while (iter.hasNext()) {
      str = (String)iter.next();
      System.out.println(str);
    }  
    
    // A partir do Java 1.5 (Generics)
    List<String> list2 = new ArrayList<String>();
    list2.add("good morning");
    list2.add("good afternoon");
    Iterator<String> iter2 = list2.iterator();
    while (iter2.hasNext()) {
      str = iter2.next();
      System.out.println(str);
    } 
    
  }

}
