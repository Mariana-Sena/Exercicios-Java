import java.time.LocalDate;

public class Soldado extends Militar{
	private String email;
	private String telefone;
	
	
	public Soldado() {
		super();
		this.email = "";
		this.telefone = "";
	}
	
	public Soldado(String email, String telefone, String nome, Integer dia, Integer mes, Integer ano) {
		super(nome, dia, mes, ano);
		this.email = email;
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public String toString() {
		return super.toString() + "email: " + this.email + "telefone: " + this.telefone;
	}
}
