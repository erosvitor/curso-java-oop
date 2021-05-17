package o05_encapsulamento.exemplos;

public class Livro {
  
  private String titulo;
  private short anoLancamento;

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public short getAnoLancamento() {
    return this.anoLancamento;
  }

  public void setAnoLancamento(short anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

}
