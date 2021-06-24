package o02_sobrecarga.exemplos;

public class FigurasPlanas {
  
  public int calcularAreaQuadrado(int lado) {
    return lado * lado;
  }
  
  public float calcularAreaQuadrado(float lado) {
    return lado * lado;
  }

  public float calcularAreaCirculo(float raio) {
    return 3.14f * (raio * raio);
  }
  
  public float calcularAreaCirculo(float raio, float pi) {
    return pi * (raio * raio);
  }

}
