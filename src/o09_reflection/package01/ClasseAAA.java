package o09_reflection.package01;

public class ClasseAAA implements InterfaceGeneric {

  @Override
  public void imprimir() {
    System.out.println("Aqui é a classe " + this.getClass().getSimpleName() + " em ação");
  }

}
