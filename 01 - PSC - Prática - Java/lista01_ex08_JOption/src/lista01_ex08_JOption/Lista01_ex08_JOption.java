package lista01_ex08_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex08_JOption {

	public static void main(String[] args) {
		float peso, engordar15, emagrecer20;

		peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da pessoa em KG"));

		engordar15 = peso * (float) 1.15;

		emagrecer20 = peso * (float) 0.8;

		JOptionPane.showMessageDialog(null,
				" Se a pessoa engordar 15%: " + engordar15 + "KG\nSe a pessoa emagrecer 20%: " + emagrecer20 + "KG");

	}

}
