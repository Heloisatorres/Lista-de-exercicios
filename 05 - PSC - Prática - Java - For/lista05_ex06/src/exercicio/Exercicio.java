package exercicio;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		int idades = 0, media = 0;
		Scanner t = new Scanner(System.in);
		

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a idade n"+(i+1));
			idades += t.nextInt();

			media = idades / 10;

		}
		System.out.println(media);
		t.close();
	}
}
