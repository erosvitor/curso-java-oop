package o03_construtores_sobrecarga.exemplos;

public class Aluno {
  
  public String nome;
  public boolean ativo;

  public Aluno() {
    ativo = true;
  }
  
  public Aluno(String nome) {
    this.nome = nome;
    this.ativo = true;
  }

}
