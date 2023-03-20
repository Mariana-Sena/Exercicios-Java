import java.time.DayOfWeek;
import java.time.LocalDate;


//Faça um programa Java que imprima todos anos bissexto desde 1900;

public class Exercico3 {
	public static void main (String[] args) {
		for (int x = 1900; x<=2022; x++) {
			LocalDate data = LocalDate.of(x, 1, 1);
			if(data.isLeapYear()) {
				System.out.println(data.getYear() + " é bissexto");
				data = data.plusYears(x);
	
			}
		}
		
	}
}

