package application;

import java.util.Scanner;

/*Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo n�meros inteiros,
podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
esquerda, acima, � direita e abaixo de X, quando houver, conforme
exemplo.
*/
public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o numero de linhas da Matriz: ");
		int linhas = sc.nextInt();

		System.out.print("Informe o numero de colunas da Matriz: ");
		int colunas = sc.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Informe os n�meros da linha " + i + ":");
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Informe um numero da matriz: ");
		int numEscolhido = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numEscolhido) {

					System.out.println("Posi��o: " + i + ", " + j);

					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + matriz[i - 1][j]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Baixo: " + matriz[i + 1][j]);
					}
					System.out.println("");
				}
			}
		}

		sc.close();
	}

}
