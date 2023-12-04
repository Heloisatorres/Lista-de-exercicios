package exercicio;

import java.util.ArrayList;

public class Cadastro {
	private ArrayList<PessoaFisica> veiculos;

	public Cadastro() {
		veiculos = new ArrayList<>();
	}

	public void cadastrarVeiculo(String marca, String modelo, String numeroChassi, String placa, String cor) {
		PessoaFisica veiculo = new PessoaFisica(marca, modelo, numeroChassi, placa, cor);
		veiculos.add(veiculo);
	}

	public void imprimirVeiculos() {
		for (int i = 0; i < veiculos.size(); i++) {
			System.out.println("Veículo: " + (i + 1));
			System.out.println("Marca: " + veiculos.get(i).getMarca());
			System.out.println("Modelo: " + veiculos.get(i).getModelo());
			System.out.println("Número do Chassi: " + veiculos.get(i).getNumeroChassi());
			System.out.println("Placa: " + veiculos.get(i).getPlaca());
			System.out.println("Cor: " + veiculos.get(i).getCor());
			System.out.println("");
		}
	}

}
