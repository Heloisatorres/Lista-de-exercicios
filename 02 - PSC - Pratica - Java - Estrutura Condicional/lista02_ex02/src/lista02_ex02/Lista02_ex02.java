package lista02_ex02;

import javax.swing.JOptionPane;

public class Lista02_ex02 {
	public static void main(String[] args) {
		int lado1, lado2, lado3;

		lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do primeiro lado"));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do primeiro lado"));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do primeiro lado"));
		if (lado1 == lado2 && lado2 == lado3) {
			JOptionPane.showMessageDialog(null,"Equilátero: os três lados são iguais.");
		}
		else if(lado1 != lado2 && lado2 != lado3) {
			JOptionPane.showMessageDialog(null,"Escaleno: 3 lados diferentes.");
		}
		else {JOptionPane.showMessageDialog(null,"Isósceles: 2 lados são iguais.");}

	}
}
