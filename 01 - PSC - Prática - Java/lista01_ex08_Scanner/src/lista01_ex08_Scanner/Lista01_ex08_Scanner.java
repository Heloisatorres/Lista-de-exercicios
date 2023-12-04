package lista01_ex08_Scanner;

import java.util.Scanner;

public class Lista01_ex08_Scanner {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		float peso, engordar15, emagrecer20;

		System.out.print("Digite o peso da pessoa ");

		peso = t.nextFloat();

		engordar15 = peso * (float) 1.15;
		emagrecer20 = peso * (float) 0.8;

		System.out.print("Se a pessoa engordar 15%: " + engordar15 + "\nSe a pessoa emagrecer 20%: " + emagrecer20);
	}

}
