package application;

import java.util.Scanner;

import entities.Estudante;
import entities.Quarto;

/* 
 * A dona de um pensionato possui dez quartos para alugar para estudantes, 
 * sendo esses quartos identificados pelos números 0 a 9.
 * Fazer um programa que inicie com todos os dez quartos vazios, e depois 
 * leia uma quantidade N representando o número de estudantes que vão 
 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos 
 * N estudantes. Para cada registro de aluguel, informar o nome e email do 
 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha 
 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir 
 * um relatório de todas ocupações do pensionato, por ordem de quarto.
 */

public class AluguelDeQuartos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Quarto[] quartosVetor = new Quarto[10];

		System.out.printf("Quantos quartos serão alugados? ");
		int quartosAlugados = sc.nextInt();
		sc.nextLine();
		Estudante[] estudantesVetor = new Estudante[quartosAlugados];
		System.out.printf("%nQual o valor do aluguel? ");
		double valorAluguel = sc.nextDouble();
		sc.nextLine();

		for (int i = 0; i < quartosAlugados; i++) {
			System.out.printf("%nInformar dados do aluguel " + (i + 1) + ":%n");
			System.out.printf("Nome estudante: ");
			String nomeEstudante = sc.nextLine();
			System.out.printf("E-mail estudante: ");
			String emailEstudante = sc.nextLine();
			System.out.printf("Número do Quarto: ");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();

			quartosVetor[i] = new Quarto(numeroQuarto, valorAluguel, true);

			estudantesVetor[i] = new Estudante(nomeEstudante, emailEstudante, quartosVetor[i]);
		}

		System.out.printf("%nQuartos ocupados: %n");
		for (int i = 0; i < quartosAlugados; i++) {
			System.out.println(estudantesVetor[i].getQuarto().getNumeroQuarto() + ": " + estudantesVetor[i].getNome()
					+ ", " + estudantesVetor[i].getEmail() + ", R$"
					+ String.format("%.2f", estudantesVetor[i].getQuarto().getValorAluguel()));
		}

		sc.close();

	}

}
