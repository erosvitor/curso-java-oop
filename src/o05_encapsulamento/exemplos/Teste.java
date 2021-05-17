/*
 
ENCAPSULAMENTO

Descrição
--------------------------------------------------------------------------------
???
 

public class Livro {
  public String titulo;
  public short anoLancamento;
}


Aplicando o encapsulamento
--------------------------------------------------------------------------------

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

...
Livro livro1 = new Livro();
livro1.setTitulo("C Completo e Total - 3 edição");
livro1.setAnoLancamento((short)1996);

*/

package o05_encapsulamento.exemplos;

public class Teste {

  public static void main(String[] args) {
    
    Livro livro1 = new Livro();
    livro1.setTitulo("C Completo e Total - 3 edição");
    livro1.setAnoLancamento((short)1996);

  }

}
