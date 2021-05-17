package o07_listasobjetos.exemplos;

public class ForEach {

  public static void main(String[] args) {
    
    int numbers[] = {12, 13, 14, 44};

    // Até o Java 1.4
    for (int i=0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    
    // A partir do Java 1.5
    for (int num : numbers) {
      System.out.println(num);
    }

  }

}
