package o09_reflection.package01;

public class ClasseAAB implements InterfaceGeneric {

  @Override
  public void imprimir() {
    System.out.println("Aqui é a classe " + this.getClass().getSimpleName() + " em ação");
  }

}
