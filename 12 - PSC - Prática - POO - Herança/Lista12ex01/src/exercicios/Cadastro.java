package exercicios;
import java.util.Arrays;

//Cadastro class
public class Cadastro {
 private Pessoa[] cadastro;
 private int totalPessoas;

 public Cadastro(int tamanhoMaximo) {
     cadastro = new Pessoa[tamanhoMaximo];
     totalPessoas = 0;
 }

 public void cadastrarPessoa(Pessoa pessoa) {
     if (totalPessoas < cadastro.length) {
         cadastro[totalPessoas++] = pessoa;
         System.out.println("Pessoa cadastrada com sucesso!");
     } else {
         System.out.println("Limite de cadastros atingido!");
     }
 }

 public void imprimirCadastro() {
     System.out.println("\n=== Cadastro de Pessoas ===");
     for (int i = 0; i < totalPessoas; i++) {
         System.out.println("Nome: " + cadastro[i].getNome());
         if (cadastro[i] instanceof PessoaFisica) {
             System.out.println("CPF: " + ((PessoaFisica) cadastro[i]).getCPF());
         } else if (cadastro[i] instanceof PessoaJuridica) {
             System.out.println("CNPJ: " + ((PessoaJuridica) cadastro[i]).getCNPJ());
         }
         System.out.println("------------------------");
     }
 }
}
