package lista06_ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[10];
		int soma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o proximo numero ");
			vetor[i] = teclado.nextInt();
		}
		System.out.println(Arrays.toString(vetor));

		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 != 0) {

				soma += vetor[i];
			}
		}
		System.out.println("Soma dos impares "+soma);
		teclado.close();
	}
}
