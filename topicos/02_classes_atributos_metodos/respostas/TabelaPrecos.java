
public class TabelaPrecos {

  public static void main(String[] args) {
    
    Produto prod = new Produto();
    prod.descricao = "Caneta";
    prod.preco = 1.50;

    System.out.println("Preço distribuidor: " + prod.precoDistribuidor());
    System.out.println("Preço representante: " + prod.precoRepresentante());
    System.out.println("Preço consumidor: " + prod.precoConsumitor());

  }

}
