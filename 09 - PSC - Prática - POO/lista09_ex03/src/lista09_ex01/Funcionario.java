package lista09_ex01;

public class Funcionario {
	public String nome, cargo, endereco;
	public float salario;
	public int telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	/*construtor */
	public Funcionario(String nome, String cargo, String endereco, float salario, int telefone) {
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
		this.salario = salario;
		this.telefone = telefone;
	}

	/* exibe nome e cargo */
	public void exibe() {
		System.out.println("nome " + nome);
		System.out.println("cargo " + cargo);
		System.out.println("endereco " + endereco);
		System.out.println("salario " + salario);
		System.out.println("telefone " + telefone);

	}

}
