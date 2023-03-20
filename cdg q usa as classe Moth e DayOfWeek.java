import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;

// Faça um programa Java que utilize as classe Moth e DayOfWeek;

public class Exercico6 {
	public static void main (String[] args) {
		LocalDate data = LocalDate.of(2022,1, 1);
		
		for(int a = 1; a <= 365; a++) {
			LocalDate x = data.plusDays(a);
			DayOfWeek d = x.getDayOfWeek();
			Month m = x.getMonth();
			System.out.println("Dia da semana: " + d + ", mes " + m);
		}
		
		
	}
}
