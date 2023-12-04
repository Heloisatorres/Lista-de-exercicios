package exercicio;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		Cadastro cadastro = new Cadastro();

		System.out.print("Informe o nome da pessoa física: ");
		String nomePF = t.nextLine();
		System.out.print("Informe o CPF da pessoa física: ");
		String cpf = t.nextLine();

		PessoaFisica pessoaFisica = new PessoaFisica(nomePF, cpf);
		cadastro.cadastrarPessoa(pessoaFisica);

		System.out.print("\nInforme o nome da pessoa jurídica: ");
		String nomePJ = t.nextLine();
		System.out.print("Informe o CNPJ da pessoa jurídica: ");
		String cnpj = t.nextLine();

		PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePJ, cnpj);
		cadastro.cadastrarPessoa(pessoaJuridica);

		cadastro.imprimirCadastro();
		t.close();
	}
}
