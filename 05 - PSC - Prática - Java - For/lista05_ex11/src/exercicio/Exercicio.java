package exercicio;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int masculino = 0, feminino = 0, peso = 0;

		for (int i = 0; i <= 10; i++) {
			System.out.print("Sexo ");
			String sexo = t.next();

			System.out.print("Peso ");
			peso = t.nextInt();

			if (sexo.equalsIgnoreCase("M") && peso <= 80 && peso >= 60) {
				masculino++;

			}
			if (sexo.equalsIgnoreCase("F") && peso <= 70 && peso >= 50) {
				feminino++;

			}
		}
		System.out.println("Homens " + masculino);
		System.out.println("Mulheres " + feminino);
	}
}
