package exercicios;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadastro cadastro = new Cadastro(100);

        System.out.print("Informe o nome da pessoa física: ");
        String nomePF = scanner.nextLine();
        System.out.print("Informe o CPF da pessoa física: ");
        String cpf = scanner.nextLine();

        PessoaFisica pessoaFisica = new PessoaFisica(nomePF, cpf);
        cadastro.cadastrarPessoa(pessoaFisica);

        System.out.print("\nInforme o nome da pessoa jurídica: ");
        String nomePJ = scanner.nextLine();
        System.out.print("Informe o CNPJ da pessoa jurídica: ");
        String cnpj = scanner.nextLine();

        PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePJ, cnpj);
        cadastro.cadastrarPessoa(pessoaJuridica);

        cadastro.imprimirCadastro();

        scanner.close();
    }
}

