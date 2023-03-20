import java.time.DayOfWeek;
import java.time.LocalDate;

//Faça um programa Java que imprima a data de todas segunda-feiras do ano 2000;

public class Exercicio2 {
	public static void main (String[] args) {
		LocalDate data = LocalDate.of(2000, 1, 1);
		
		for (int x = 1; x<=365; x++) {
			LocalDate d = data.plusDays(x);
			if((d.getDayOfWeek() == DayOfWeek.MONDAY)){ 
				System.out.println(d + " - " + d.getDayOfWeek());
			}
			
			}
	}
}
