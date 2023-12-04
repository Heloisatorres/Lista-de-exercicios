package lista02_ex06;

import java.util.Scanner;

public class Lista02_ex06 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		int X, Y, Z;
		System.out.println("Digite o valor de X");
		X = t.nextInt();
		System.out.println("Digite o valor de Y");
		Y = t.nextInt();
		System.out.println("Digite o valor de Z");
		Z = X = t.nextInt();

		if (Y - Z < X && X < Y + Z && X - Z < Y && Y < X + Z && X - Y < Z && Z < X + Y) {

			System.out.println("os três valores informados podem ser os comprimentos dos lados de um triângulo.");

		} else {
			System.out.println("os três valores informados não podem ser os comprimentos dos lados de um triângulo.");
		}

	}

}
