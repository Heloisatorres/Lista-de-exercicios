package lista02_ex03;

import java.util.Scanner;

public class Lista02_ex03 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;

		Scanner t = new Scanner(System.in);

		System.out.println("Digite a nota 1");
		nota1 = t.nextFloat();

		System.out.println("Digite a nota 2");
		nota2 = t.nextFloat();

		System.out.println("Digite a nota 3");
		nota3 = t.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;

		if (nota1 <= 10 && nota2 <= 10 && nota3 <= 10 && nota1 >= 0 && nota2 >= 0 && nota3 >= 0) {
			System.out.println("Média: " + media);
			if (media < 3) {
				System.out.println("Reprovado");
			} else if (media < 7) {
				System.out.println("Exame");
			} else {
				System.out.println("Aprovado");
			}

		} else {

			System.out.println("Digite apenas notas entre 0 e 10");
		}

	}

}
