package lista02_ex05;

import java.util.Scanner;

public class Lista02_ex05 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int x, resultado = 0;
		System.out.println("Digite o valor de x ");
		x = t.nextInt();

		if (x < -2) {
			resultado = 2 * x + 2;
		} else if (x >= -2 && x < 3) {

			resultado = 3;
		} else if (x >= 3) {
			resultado = x * -1;

		}

		System.out.println("x = " + resultado);
	}

}
