package exercicio;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {

		int fatorial = 1, numero;
		Scanner t = new Scanner(System.in);
		System.out.println("numero ");
		numero = t.nextInt();

		for (int i = 1; i <= numero; i++) {
			fatorial *= i;

		}
		if (numero == 0) {
			fatorial = 1;
		}
		System.out.println(fatorial);
	}
}
