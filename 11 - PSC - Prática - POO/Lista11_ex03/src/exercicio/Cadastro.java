package exercicio;

public class Cadastro {
    private static final int MAX_PESSOAS = 100;
    private Pessoa[] pessoas;
    private int totalPessoas;

    public Cadastro() {
        pessoas = new Pessoa[MAX_PESSOAS];
        totalPessoas = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (totalPessoas < MAX_PESSOAS) {
            pessoas[totalPessoas++] = pessoa;
            System.out.println("Pessoa cadastrada com sucesso!");
        } else {
            System.out.println("Limite de cadastros atingido!");
        }
    }

    public void imprimirCadastro() {
        System.out.println("\n=== Cadastro de Pessoas ===");
        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Nome: " + pessoas[i].getNome());
            if (pessoas[i] instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCPF());
            } else if (pessoas[i] instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCNPJ());
            }
            System.out.println("------------------------");
        }
    }
}

