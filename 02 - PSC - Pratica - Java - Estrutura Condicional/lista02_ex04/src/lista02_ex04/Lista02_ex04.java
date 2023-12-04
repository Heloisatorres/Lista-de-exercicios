package lista02_ex04;

import java.util.Scanner;

public class Lista02_ex04 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		float peso, altura, IMC;
		
		System.out.println("Digite o peso");
		peso = t.nextFloat();
		System.out.println("Digite a altura");
		altura = t.nextFloat();

		IMC = (float) (peso / Math.pow(altura, 2));

		System.out.println(IMC);
		if (IMC < 20) {
			System.out.println("Abaixo do Peso");
		} else if (IMC < 25) {
			System.out.println("Normal");
		} else if (IMC < 30) {
			System.out.println("Sobrepeso");
		} else if (IMC < 40) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade Mórbida");
		}

	}

}
