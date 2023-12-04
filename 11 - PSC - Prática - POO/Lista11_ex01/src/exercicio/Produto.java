package exercicio;

public class Produto {

	private static int ultimoId = 0;

	private int id;
	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.id = ++ultimoId;
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
		this("Nome não informado", 0);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
