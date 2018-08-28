package application;

import java.util.Scanner;

import entities.Produto;

/*
 * Fazer um programa para ler um n�mero inteiro N e os dados (nome epre�o) 
 * de N Produtos. Armazene os N produtos em um vetor. 
 * Em seguida, mostrar o pre�o m�dio dos produtos.
 */

public class VetorProdutos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe total de produtos: ");
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];

		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.printf("%nProduto " + (i + 1) + ":%n");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Pre�o: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}

		double somaPrecos = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			somaPrecos += vetor[i].getPreco();
		}

		System.out.printf("%nPre�o m�dio dos produtos: R$%.2f", somaPrecos / vetor.length);

		sc.close();
	}

}
