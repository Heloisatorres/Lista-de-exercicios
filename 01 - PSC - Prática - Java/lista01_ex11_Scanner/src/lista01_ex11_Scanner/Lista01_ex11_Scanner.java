package lista01_ex11_Scanner;

import java.util.Scanner;

public class Lista01_ex11_Scanner {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numero;
		
		String acumulador = "";
		System.out.print("Digite um número ");
		numero = t.nextInt();

		for (int i = 0; i <= 10; i++) {
			acumulador += numero + " X " + i + " = " + numero * i + "\n";

		}
		System.out.print(acumulador);

	}

}
