package entities;

public class Quarto {

	private int numeroQuarto;
	private double valorAluguel;
	private boolean alugado;

	public Quarto(int numeroQuarto, double valorAluguel, boolean alugado) {
		this.numeroQuarto = numeroQuarto;
		this.valorAluguel = valorAluguel;
		this.alugado = alugado;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

}
