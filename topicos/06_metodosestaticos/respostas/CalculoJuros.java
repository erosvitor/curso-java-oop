
public class CalculoJuros {

  public static void main(String[] args) {
    
    double jurosSimples = Juros.jurosSimples(1000, 10, 1);
    System.out.println("Juros simples: " + jurosSimples);

    double jurosCompostos = Juros.jurosCompostos(1000, 10, 1);
    System.out.println("Juros compostos: " + jurosCompostos);

  }

}
