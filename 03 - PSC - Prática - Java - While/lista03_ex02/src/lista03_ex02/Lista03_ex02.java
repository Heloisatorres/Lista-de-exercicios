package lista03_ex02;

import java.util.Scanner;

public class Lista03_ex02 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int matricula, n1, n2, n3, media;

		System.out.print("Matricula ");
		matricula = t.nextInt();

		while (matricula >= 0) {

			System.out.println("n1 ");
			n1 = t.nextInt();

			System.out.println("n2 ");
			n2 = t.nextInt();

			System.out.println("n3 ");
			n3 = t.nextInt();

			media = (n1 + n2 + n3) / 3;
			if (media < 60) {
				System.out.println("aluno " + matricula + " media " + media
						+ " Reprovado\n-----------------------------------------------");
			} else if (media < 70) {
				System.out.println("aluno " + matricula + " media " + media
						+ " recuperacao \n-----------------------------------------------");
			} else {
				System.out.println("aluno " + matricula + " media " + media
						+ " aprovado\n-----------------------------------------------");
			}

			System.out.print("Matricula ");
			matricula = t.nextInt();

		}
		System.out.println("Programa encerrado");

	}

}
