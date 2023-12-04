package lista01_ex09_Scanner;

import java.util.Scanner;

public class Lista01_ex09_Scanner {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int a, b, c;

		System.out.print("Digite o valor do primeiro cateto em cm ");
		b = t.nextInt();
		
		System.out.print("Digite o valor do segundo cateto em cm ");
		c = t.nextInt();

		a = (b * b) + (c * c);

		System.out.print("O valor da hipotenusa é: " + a + " cm");

	}

}
