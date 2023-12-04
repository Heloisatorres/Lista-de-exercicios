package lista01_ex05_Scanner;

import java.util.Scanner;

public class Lista01_ex04_Scanner {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float diagonalMaior, diagonalMenor, areaDolosango;

		System.out.print("Digite o tamanho da diagonal maior em cm ");
		diagonalMaior = teclado.nextFloat();

		System.out.print("Digite o tamanho da diagonal menor em cm ");
		diagonalMenor = teclado.nextFloat();

		areaDolosango = (diagonalMaior * diagonalMenor) / 2;

		System.out.print("A área do losango é " + areaDolosango + "cm");

	}

}
