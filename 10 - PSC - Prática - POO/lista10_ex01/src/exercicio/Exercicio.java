package exercicio;

public class Exercicio {

	public static void main(String[] args) {

		
		Cadastro cadastro = new Cadastro();

		
		cadastro.cadastrarVeiculo("Toyota", "Corolla", "1234567890123456", "ABC-1234", "Branco");
		cadastro.cadastrarVeiculo("Ford", "Fiesta", "2345678901234567", "XYZ-5678", "Preto");

		
		cadastro.imprimirVeiculos();
	}
}
