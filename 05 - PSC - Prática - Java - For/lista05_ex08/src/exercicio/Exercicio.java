package exercicio;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		int base = 1, expoente = 1, resultado = 1;
		Scanner t = new Scanner(System.in);
		
		System.out.println("Base");
		base = t.nextInt();
		System.out.println("Expoente");
		expoente = t.nextInt();

		for (int i = 0; i < expoente; i++) {

			resultado *= base;
		}
		System.out.println("resultado "+resultado);
	}
}
