
import java.time.LocalDate;

public class TestarCalendario {

  public static void main(String[] args) {
    
    Calendario cal = new Calendario(LocalDate.now());
    System.out.println(cal.mesPorExtenso());
    System.out.println(cal.dataPorExtenso());

  }

}
