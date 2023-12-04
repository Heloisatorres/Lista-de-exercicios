package lista03_ex04;

import java.util.Scanner;

public class Lista03_ex04 {
	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		double mediaSalario = 0;
		double mediaFilhos = 0;
		int quantidadeSalarios = 0;
		int quantidadeFilhos = 0;

		while (true) {
			System.out.println("Digite o salário (negativo para terminar): ");
			double salario = t.nextDouble();
			if (salario < 0) {
				break;
			}
			mediaSalario += salario;
			quantidadeSalarios++;

			System.out.println("Digite o número de filhos: ");
			int numFilhos = t.nextInt();
			mediaFilhos += numFilhos;
			quantidadeFilhos++;
		}

		mediaSalario /= quantidadeSalarios;
		mediaFilhos /= quantidadeFilhos;

		System.out.println("A média salarial da população é: " + mediaSalario);
		System.out.println("A média do número de filhos é: " + mediaFilhos);

		
	}

}
