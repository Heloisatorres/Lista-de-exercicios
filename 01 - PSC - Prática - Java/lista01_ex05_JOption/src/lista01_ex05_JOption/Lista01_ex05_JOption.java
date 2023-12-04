package lista01_ex05_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex05_JOption {

	public static void main(String[] args) {
		float diagonalMaior , diagonalMenor, areaLosango;
		
		diagonalMaior = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho da diagonal Maior em cm	"));
		
		diagonalMenor = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho da diagonal Menor em cm"));

		areaLosango = (diagonalMaior * diagonalMenor)/2;
		
		JOptionPane.showMessageDialog(null,"A área do losango é "+areaLosango+" cm");
	}

}
