
public class Moto extends Veiculo {
	private Integer quantidadeCilindradas;
	
	public Moto (String modelo, String marca, Integer quantidadeCilindradas) {
		super(modelo, marca);
		this.quantidadeCilindradas = quantidadeCilindradas;
	}

	public Integer getQuantidadeCilindradas() {
		return quantidadeCilindradas;
	}

	public void setQuantidadeCilindradas(Integer quantidadeCilindradas) {
		this.quantidadeCilindradas = quantidadeCilindradas;
	}
	
	public String toString() {
		return super.toString() + "\nquantidade Cilindradas: " + this.quantidadeCilindradas;
	}

}
