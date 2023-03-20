
public class Barco extends Veiculo {
	private Integer potenciaMotor;
	
	public Barco(String modelo, String marca, Integer potenciaMotor) {
		super (modelo, marca);
		this.potenciaMotor = potenciaMotor;
	}

	public Integer getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(Integer potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	public String toString() {
		return super.toString() + "\npotencia Motor: " + this.potenciaMotor;
	}

}
