package lista02_ex08;

import javax.swing.JOptionPane;

public class Lista02_ex08 {
	public static void main(String[] args) {
		int codigo;
		String[] produtos = { "Sapato R$: 99.99", "Bolsa R$ 103,89", "Camisa R$ 49,98", "Calça R$ 89,72",
				"Blusa R$ 97,35" };

		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));

		if(codigo <=5) {
		JOptionPane.showMessageDialog(null, produtos[codigo-1]);
	
		}
		else {JOptionPane.showMessageDialog(null, "Digite um código entre 1 e 5");}
		
	}
}
