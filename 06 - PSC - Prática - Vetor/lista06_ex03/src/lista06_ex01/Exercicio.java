package lista06_ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[10];
		int maior = 0, menor = 999999999;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o proximo numero ");
			vetor[i] = teclado.nextInt();
		}
		System.out.println(Arrays.toString(vetor));

		for (int i = 0; i < 10; i++) {
			if (vetor[i] < menor) {

				menor = vetor[i];
			}
			if (vetor[i] > maior) {

				maior = vetor[i];
			}
		}
		System.out.println("maior: " + maior + " menor: " + menor);
		teclado.close();
	}
}
