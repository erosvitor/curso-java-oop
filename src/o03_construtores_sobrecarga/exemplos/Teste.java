package o03_construtores_sobrecarga.exemplos;

public class Teste {

  public static void main(String[] args) {
    
    Aluno aluno1 = new Aluno();
    if (aluno1.ativo) {
      System.out.println("Aluno esta ativo");
    } else {
      System.out.println("Aluno não esta ativo");
    }
    
    Aluno aluno2 = new Aluno("Fulano da Silva");
    if (aluno2.ativo) {
      System.out.println("Aluno esta ativo");
    } else {
      System.out.println("Aluno não esta ativo");
    }

  }

}
