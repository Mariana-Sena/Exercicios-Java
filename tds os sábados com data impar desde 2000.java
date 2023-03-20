import java.time.DayOfWeek;
import java.time.LocalDate;


//Faça um programa Java que imprima todos os sábados com data impar desde 2000;

public class Exercicio4 {
	public static void main (String[] args) {
	
	for(int c =2000; c<=2022; c++) {
		LocalDate data = LocalDate.of(c, 1, 1);
	
	
	for (int d = 1; d<=365; d++) {
		LocalDate x = data.plusDays(d);
		if(x.getDayOfMonth() % 2 == 1) {
			if((x.getDayOfWeek() == DayOfWeek.SATURDAY)){ 
				System.out.println(x + " - " + x.getDayOfWeek());
			}
			
			
		}	
		}
		}
	}
}

