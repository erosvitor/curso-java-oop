package o01_classes_atributos_metodos.exemplos;

public class Teste {

  public static void main(String[] args) {
    
    Carro carro1 = new Carro();
    carro1.marca = "Ford";
    carro1.modelo = "Fusion";
    carro1.cor = "Preta";
    carro1.capacidadeTanque = 55;
    carro1.kmPorLitro = 8;

    float autonomia = carro1.calcularAutonomia();
    System.out.println("Autonomia do carro " + carro1.modelo + " é de " + autonomia);

    float quilometragem = 400;
    float qtdeCombustivel = carro1.calcularCombustivel(quilometragem);
    System.out.println("Para uma viagem de " + quilometragem + "km, são necessários " + qtdeCombustivel + " litros de combustível");    

  }

}
