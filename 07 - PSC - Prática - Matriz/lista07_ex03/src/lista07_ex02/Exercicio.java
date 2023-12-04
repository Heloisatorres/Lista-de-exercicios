package lista07_ex02;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] matrixA = new double[2][2];
		double[][] matrixB = new double[2][2];
		double[][] matrixC = new double[2][2];

		System.out.println("Digite os elementos da primeira matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrixA[i][j] = scanner.nextDouble();
			}
		}

		System.out.println("Digite os elementos da segunda matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrixB[i][j] = scanner.nextDouble();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrixC[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}

		System.out.println("A matriz resultante é:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrixC[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}