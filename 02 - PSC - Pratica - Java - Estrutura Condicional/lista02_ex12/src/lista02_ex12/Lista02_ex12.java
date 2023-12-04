package lista02_ex12;

import java.util.Scanner;

public class Lista02_ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String sexo;
		int idade;
		float mensalidade = 0;
		System.out.print("Sexo(masculino/feminino): ");
		sexo = (teclado.next().toUpperCase());

		System.out.print("Idade: ");
		idade = teclado.nextInt();

		if (sexo.equals("MASCULINO")) {
			if (idade <= 15) {
				mensalidade = (float) 60.00;
			} else if (idade <= 18) {
				mensalidade = (float) 75.00;
			} else if (idade <= 30) {
				mensalidade = (float) 90.00;
			} else if (idade <= 40) {
				mensalidade = (float) 85.00;
			} else {
				mensalidade = (float) 80.00;
			}

		} else if (sexo.equals("FEMININO")) {
			if (idade <= 18) {
				mensalidade = (float) 60.00;

			} else if (idade <= 25) {
				mensalidade = (float) 90.00;
			} else if (idade <= 40) {
				mensalidade = (float) 85.00;
			} else {
				mensalidade = (float) 80.00;
			}
		}

		else {
			System.out.println("Digite o sexo corretamente.");
			return;
		}

		System.out.println("Sexo: " + sexo + "\nIdade: " + idade + "\nMensalidade: " + mensalidade);

	}

}
