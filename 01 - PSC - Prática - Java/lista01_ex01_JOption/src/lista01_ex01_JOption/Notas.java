package lista01_ex01_JOption;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {

		String nota1, nota2, nota3;
		float n1,n2,n3;

		nota1 = JOptionPane.showInputDialog("Escreva a primeira nota");
		n1 = Float.parseFloat(nota1);

		nota2 = JOptionPane.showInputDialog("Escreva a segunda nota");
		n2 = Float.parseFloat(nota2);

		nota3 = JOptionPane.showInputDialog("Escreva a terceira nota");
		n3 = Float.parseFloat(nota3);
		
		float media = ((n1 + n2 + n3) / 3);
		

		JOptionPane.showMessageDialog(null,media);

	}

}
