package lista09_ex01;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		int numeroAgencia, numeroConta;
		double saque;
		Scanner t = new Scanner(System.in);
		ContaCorrente contaCorrente;

		contaCorrente = new ContaCorrente();
		System.out.println("Informe o numero da agencia");
		numeroAgencia = t.nextInt();

		System.out.println("Informe o numero da conta");
		numeroConta = t.nextInt();

		contaCorrente.iniciarContaCorrente(numeroAgencia, numeroConta);

		contaCorrente.exibe();

		System.out.println("Quanto deseja sacar?");
		saque = t.nextDouble();
		contaCorrente.sacar(saque);

		contaCorrente.exibe();
		t.close();
	}
}
