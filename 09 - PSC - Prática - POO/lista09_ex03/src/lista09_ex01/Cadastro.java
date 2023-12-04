package lista09_ex01;

import java.util.ArrayList;

public class Cadastro {
	ArrayList<Funcionario> funcionarios;

	public Cadastro() {
		funcionarios = new ArrayList<>();
	}

	public void addFuncionario(String nome, String cargo, String endereco, float salario, int telefone) {

		Funcionario funcionario = new Funcionario(nome, cargo, endereco, salario, telefone);

		funcionarios.add(funcionario);

	}

	/*imprime todos os funcionarios*/
	public void imprimirFuncionarios() {
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println("Funcionário: " + (i + 1));
			System.out.println("Nome: " + funcionarios.get(i).getNome());
			System.out.println("Cargo: " + funcionarios.get(i).getCargo());
			System.out.println("Endereço: " + funcionarios.get(i).getEndereco());
			System.out.println("Salário: " + funcionarios.get(i).getSalario());
			System.out.println("Telefone: " + funcionarios.get(i).getTelefone());
			
		}
	}
}
