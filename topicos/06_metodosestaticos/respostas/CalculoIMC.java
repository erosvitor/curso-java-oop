package testes;

public class CalculoIMC {

  public static void main(String[] args) {

    double peso = 78.0;
    double altura = 1.67;

    double imc = IMC.calcularIndice(peso, altura);
    String classificacao = IMC.retornarClassificacao(imc);
    
    System.out.println(String.format("IMC: %.2f", imc));
    System.out.println("Classificacao: " + classificacao);
        
  }

}
