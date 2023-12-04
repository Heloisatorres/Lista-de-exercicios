package lista07_ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		int matrizA[][] = new int[2][2];
		int matrizB[][] = new int[2][2];
		int soma[][] = new int[2][2];
		Scanner t = new Scanner(System.in);

		System.out.println("Matriz A");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("linha " + i + " posicao " + j + " ");
				matrizA[i][j] = t.nextInt();
			}
		}System.out.println("____________________________");
		System.out.println("Matriz B");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.print("linha " + i + " posicao " + j + " ");
				matrizB[i][j] = t.nextInt();
			}
		}

		System.out.println(Arrays.deepToString(matrizA));
		System.out.println(Arrays.deepToString(matrizB));
		t.close();

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				soma[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		System.out.println("____________________________");
		System.out.println("soma");
		System.out.println(Arrays.deepToString(soma));
		
		

//----------------------------------------------------------------------------------------------
	}

}