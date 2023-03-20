import java.time.LocalDate;

public class Bissexto {
		public static void main (String[] args) {
			for (int ano = 1900; ano<=2022; ano++) {
				LocalDate data = LocalDate.of(ano, 1, 1);
				
				if(data.isLeapYear()) {
					LocalDate vinteenove = LocalDate.ogf(ano, 2, 29);
					System.out.println("ano: " + ano + "dia 29/02: " + vinteenove.getDayOfWeek());
					
		
				}
			}
			
		}
	}

