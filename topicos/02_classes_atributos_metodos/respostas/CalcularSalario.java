
public class CalcularSalario {

  public static void main(String[] args) {
    Funcionario func = new Funcionario();
    func.nome = "Fulano";
    func.cargo = "Vendedor";
    func.valorHora = 14.50f;

    int horasTrabalhadas = 30;
    float salario = func.calcularSalario(horasTrabalhadas);

    System.out.println("O salário é: " + salario);

  }

}
