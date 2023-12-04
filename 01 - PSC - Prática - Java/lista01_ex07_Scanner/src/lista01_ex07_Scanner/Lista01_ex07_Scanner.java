package lista01_ex07_Scanner;

import java.util.Scanner;

public class Lista01_ex07_Scanner {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		float salarioMinimo, salarioFuncionario, salariosMinimosDoFuncionario;

		System.out.print("Digite o valor do salário minimo\nR$ ");
		salarioMinimo = t.nextFloat();

		System.out.print("Digite o valor do salário do funcionário\nR$ ");
		salarioFuncionario = t.nextFloat();

		salariosMinimosDoFuncionario =(salarioFuncionario/salarioMinimo);
		System.out.print("O funcionário recebe " + (int)salariosMinimosDoFuncionario + " salários mínimos");

	}

}
