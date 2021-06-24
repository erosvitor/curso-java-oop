package o01_classes_atributos_metodos.exemplos;

public class Carro {
  
  public String marca;
  public String modelo;
  public String cor;
  public float capacidadeTanque;
  public float kmPorLitro;
  
  public float calcularAutonomia() {
    return capacidadeTanque * kmPorLitro;
  }
  
  public float calcularCombustivel(float km) {
    return km / kmPorLitro;
  }

}
