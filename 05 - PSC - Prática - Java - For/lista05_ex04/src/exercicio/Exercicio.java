package exercicio;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		int idades = 0, media = 0, tamanho;
		Scanner t = new Scanner(System.in);
		System.out.println("Digite a quantidade de idades que serao inseridas");
		tamanho = t.nextInt();

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite a idade n"+(i+1));
			idades += t.nextInt();

			media = idades / tamanho;

		}
		System.out.println(media);
	}
}
