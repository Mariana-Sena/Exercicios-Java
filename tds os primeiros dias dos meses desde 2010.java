import java.time.DayOfWeek;
import java.time.LocalDate;

//Faça um programa Java que imprima o dia da semana de todos os primeiros dias dos meses desde 2010;


public class Exercico5 {
	public static void main (String[] args) {
		for(int c =2010; c<=2022; c++) {
			LocalDate data = LocalDate.of(c, 1, 1);
		
		
		for (int d = 1; d<=365; d++) {
			LocalDate x = data.plusDays(d);
				if(x.getDayOfMonth() == 1){ 
					System.out.println(x + " - " + x.getDayOfWeek());
	}
}
		}
	}
}

