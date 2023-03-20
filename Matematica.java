
public class Matematica implements Calcular{
	private Integer a, b, c;
	
	public Integer soma() {
		return a+b;
	}
	
	public Integer multiplicar() {
		return a * b;
	}
	
	public Double bhaskara() {
		return Math.pow(b, 2) - 4*a*c;
	}
	
	public Double potencia() {
		return Math.pow(a, b);
	}

}
