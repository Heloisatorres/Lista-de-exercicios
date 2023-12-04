package lista01_ex09_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex09_JOption {

	public static void main(String[] args) {

		int a, b, c;
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));

		a = (b * b) + (c * c);

		JOptionPane.showInputDialog(null,"O valor da hipotenusa é "+a+"cm");

	}

}
