package lista01_ex03_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex03_System {

	public static void main(String[] args) {
		Float valorEmReais, valorEmDolares, cotacaoDolar;

		valorEmReais = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor em reais"));

		cotacaoDolar = Float.parseFloat(JOptionPane.showInputDialog("Digite a cotação do Dolar"));

		valorEmDolares = valorEmReais * cotacaoDolar;

		JOptionPane.showMessageDialog(null, "O valor em dolares é $ " + valorEmDolares);

	}

}
