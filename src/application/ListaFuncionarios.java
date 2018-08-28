package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de 
 * N funcionários. Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. 
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma 
 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, 
 * conforme exemplos. 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa 
 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de 
 * aumento por porcentagem dada.
 */

public class ListaFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informar quantos funcionários serao criados: ");
		int qtdFuncionarios = sc.nextInt();

		List<Funcionario> listaFuncionarios = new ArrayList<>();

		System.out.println("Informe os dados dos funcionarios: ");
		for (int i = 0; i < qtdFuncionarios; i++) {
			System.out.printf("%nid: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(nome, salario, id);
			listaFuncionarios.add(funcionario);
		}

		System.out.printf("%nInformar o id do funcionario que receberá aumento: ");
		int idFuncAumento = sc.nextInt();

		Funcionario funcionarioEsolhido = listaFuncionarios.stream().filter(x -> x.getId() == idFuncAumento).findFirst()
				.orElse(null);

		while (funcionarioEsolhido == null) {
			System.out.print("Id invalido! Informe outro id: ");
			int id = sc.nextInt();
			funcionarioEsolhido = listaFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		}

		System.out.printf("%nInformar o numero do percentual de aumento: ");
		double percAumento = sc.nextDouble();

		double salarioAnterior = funcionarioEsolhido.getSalario();
		funcionarioEsolhido.aumentarSalario(percAumento);

		System.out.printf("%nDados atualizados do funcionario:%n");
		System.out.println("id: " + funcionarioEsolhido.getId());
		System.out.println("Nome: " + funcionarioEsolhido.getNome());
		System.out.printf("Salario anterior: R$%.2f", salarioAnterior);
		System.out.printf("%nSalario atualizado: R$%.2f", funcionarioEsolhido.getSalario());

		sc.close();

	}

}
