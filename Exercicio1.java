import java.time.LocalDate;

// Faça um programa Java que apresente todas datas pares do ano de 2022;


public class Exercicio1 {
	public static void main (String[] args) {
		LocalDate dia = LocalDate.of(2022, 1, 1);
		
		for (int x = 1; x<=365; x++) {
			LocalDate d = dia.plusDays(x);
			if(d.getDayOfMonth() % 2 == 0) {
				System.out.println(d);
			}
		}
	}
	

}
