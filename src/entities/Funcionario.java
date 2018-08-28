package entities;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario, int id) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}

	public void aumentarSalario(double percentualAumento) {
		double valorAumento = salario * percentualAumento / 100;
		salario += valorAumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

}
