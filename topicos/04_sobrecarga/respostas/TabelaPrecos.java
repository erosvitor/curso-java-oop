
public class TabelaPrecos {

  public static void main(String[] args) {
    
    Produto prod = new Produto();
    prod.descricao = "Fone de ouvido JBL";
    prod.preco = 127.90;

    System.out.println("Preço distribuidor: " + prod.precoDistribuidor(7.5f));
    System.out.println("Preço representante: " + prod.precoRepresentante(8.5f));
    System.out.println("Preço consumidor: " + prod.precoConsumitor(10));

  }

}
