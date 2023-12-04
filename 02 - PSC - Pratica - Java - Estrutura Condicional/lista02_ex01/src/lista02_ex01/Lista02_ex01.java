package lista02_ex01;

import java.util.Scanner;

public class Lista02_ex01 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		float nota1, nota2, media;

		System.out.print("Digite a nota 1 do aluno ");
		nota1 = t.nextInt();
		System.out.print("Digite a nota 2 do aluno ");
		nota2 = t.nextInt();
		media = (nota1 + nota2) / 2;

		if (media < 7) {
			System.out.print("Média: "+media + "\nReprovado");
		} else {
			System.out.print("Média: "+media + "\nAprovado");
		}

	}
}
