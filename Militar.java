import java.time.LocalDate;

public class Militar {
	private String nome;
	private LocalDate datanascimento;
	
	public Militar() {
		this.nome = "";
		this.datanascimento = LocalDate.now();
	}
	
	public Militar(String nome, Integer dia, Integer mes, Integer ano) {
		this.nome = nome;
		this.datanascimento = LocalDate.of(ano, mes, dia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}
	
	public String toString() {
		return "nome: " + this.nome + "data nascimento: " + this.datanascimento;
	}

	
}
