
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Calendario {

  public int dia;
  public int mes;
  public int ano;
  public int diaSemana;
  
  public Calendario(String dataStr) {
    LocalDate data = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    this.dia = data.getDayOfMonth();
    this.mes = data.getMonth().getValue();
    this.ano = data.getYear();
    this.diaSemana = data.getDayOfWeek().getValue();
  }  

  public String mesPorExtenso() {
    String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", 
             "setembro", "outubro", "novembro", "dezembro"};
    return meses[this.mes-1];
  }      

  public String diaSemanaPorExtenso() {
    String nomeDiaSemana = "";
    if (this.diaSemana == 1)
      nomeDiaSemana = "Segunda-feira";
    else if (this.diaSemana == 2) 
      nomeDiaSemana = "Terça-feira";
    else if (this.diaSemana == 3)
      nomeDiaSemana = "Quarta-feira";
    else if (this.diaSemana == 4)
      nomeDiaSemana = "Quinta-feira";
    else if (this.diaSemana == 5)
      nomeDiaSemana = "Sexta-feira";
    else if (this.diaSemana == 6)
      nomeDiaSemana = "Sabado";
    else if (this.diaSemana == 7)
      nomeDiaSemana = "Domingo";
    return nomeDiaSemana;
  }      

  public String dataPorExtenso() {
    String nomeDiaSemana = this.diaSemanaPorExtenso();
    String nomeMes = this.mesPorExtenso();
    return String.format("%s, %d de %s de %d", nomeDiaSemana, this.dia, nomeMes, this.ano);
  }
  
}  
