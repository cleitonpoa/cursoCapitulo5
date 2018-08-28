package entities;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEstoque() {
		return quantidade * preco;
	}

	public void adicionarProdutos(int qtd) {
		quantidade += qtd;
	}

	public void removerProdutos(int qtd) {
		quantidade -= qtd;
	}

	public void imprimirDadosProduto() {
		System.out.printf("Dados do produto: %s, R$%.2f, %d unidades, Total R$%.2f %n", nome, preco, quantidade,
				valorTotalEstoque());
	}
}
