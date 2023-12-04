package lista07_ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		int matriz[][] = new int[5][5];
		Scanner t = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("linha " + i + " posicao " + j + " ");
				matriz[i][j] = t.nextInt();
			}
		}

		// a
		System.out.println(Arrays.deepToString(matriz));
		t.close();

		// b
		System.out.println("Letra B");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i % 2 == 0 && j % 2 != 0) {

					System.out.println("linha " + i + " posicao " + j + " : " + matriz[i][j]);
				}
			}
		}
		// c
		int transportada[][] = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				transportada[j][i] = matriz[i][j];
			}

		}

		System.out.println("Letra C");
		System.out.println(Arrays.deepToString(transportada));

		// d
		int diagonalInvertida[][] = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				diagonalInvertida[i][j] = matriz[i][j];
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = i; j < matriz.length; j++) {
				int temp = diagonalInvertida[i][j];
				diagonalInvertida[i][j] = diagonalInvertida[j][i];
				diagonalInvertida[j][i] = temp;
			}
		}

		System.out.println("Letra D");
		System.out.println(Arrays.deepToString(diagonalInvertida));
//----------------------------------------------------------------------------------------------
	}

}
