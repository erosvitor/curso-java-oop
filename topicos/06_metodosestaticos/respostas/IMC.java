
public class IMC {
  
  public static double calcularIndice(double peso, double altura) {
    return peso / (altura * altura);
  }
  
  public static String retornarClassificacao(double imc) {
    String classificacao = "";
    if (imc <= 18.5) 
      classificacao = "Magro";
    else if (imc <= 24.0)
      classificacao = "Normal";
    else if (imc <= 29.9)
      classificacao = "Pré-obeso";
    else
      classificacao = "Obeso";
    
    return classificacao;
  }
  
}
