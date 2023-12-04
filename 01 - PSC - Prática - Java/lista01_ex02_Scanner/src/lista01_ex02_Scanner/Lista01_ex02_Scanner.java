package lista01_ex02_Scanner;

import java.util.Scanner;

public class Lista01_ex02_Scanner {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int anoNascimento, anoAtual, idadeAtual, idade2050;
		System.out.print("Digite o ano de nascimento: ");

		anoNascimento = teclado.nextInt();

		System.out.print("Digite o ano de atual: ");
		anoAtual = teclado.nextInt();

		idadeAtual = anoAtual - anoNascimento;
		idade2050 = 2050 - anoNascimento;

		System.out.println("A idade atual é: " + idadeAtual);
		System.out.println("A idade em 2050 será: " + idade2050);

	}

}
