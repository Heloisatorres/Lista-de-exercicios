package lista02_ex10;

import java.util.Scanner;

public class Lista02_ex10 {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		int numero, n1, n2, operacao = 0;

		System.out.println("1 - Somar os dois números.\n" + "2 - Multiplicar os dois números.\n"
				+ "3 - Subtrair o número maior pelo número menor (se os dois forem iguais, retorne zero).\n"
				+ "4 - Dividir o primeiro número pelo segundo (lembre-se de que não existe divisão por\n" + "zero).");

		numero = t.nextInt();

		System.out.println("Digite o primeiro numero");
		n1 = t.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = t.nextInt();

		switch (numero)

		{
		case 1: {
			System.out.print(n1 + " + " + n2 + " = ");
			operacao = n1 + n2;
			break;
		}
		case 2: {
			System.out.print(n1 + " x " + n2 + " = ");
			operacao = n1 * n2;
			break;

		}
		case 3: {

			if (n1 > n2) {
				System.out.print(n1 + " - " + n2 + " = ");
				operacao = n1 - n2;
			} else {
				System.out.print(n2 + " - " + n1 + " = ");
				operacao = n2 - n1;
			}
			break;

		}
		case 4: {

			if (n2 != 0) {
				System.out.print(n1 + " : " + n2 + " = ");
				operacao = n1 / n2;

			} else {
				System.out.println("Erro: entrada inválida");
				return;
			}
			break;
		}
		default: {
			System.out.println("Erro: entrada inválida");
			break;
		}

		}
		
		System.out.print(operacao);

	}

}
