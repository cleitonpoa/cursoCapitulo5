package entities;

public class Estudante {

	private String nome;
	private String email;
	private Quarto quarto;

	public Estudante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Estudante(String nome, String email, Quarto quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
