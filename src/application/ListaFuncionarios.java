package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

/*
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de 
 * N funcion�rios. N�o deve haver repeti��o de id.
 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio. 
 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma 
 * mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios, 
 * conforme exemplos. 
 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa 
 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de 
 * aumento por porcentagem dada.
 */

public class ListaFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informar quantos funcion�rios serao criados: ");
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

		System.out.printf("%nInformar o id do funcionario que receber� aumento: ");
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
