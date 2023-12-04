package lista01_ex04_Scanner;

import java.util.Scanner;

public class Lista01_ex04_Scanner {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float salarioAtual, salarioComAumento;

		System.out.print("Digite o salário atual do funcionário em R$ ");
		salarioAtual = teclado.nextFloat();
		salarioComAumento = salarioAtual * (float) 1.25;
		System.out.print("O salário do funcionário com aumento é R$ " + salarioComAumento);

	}

}
