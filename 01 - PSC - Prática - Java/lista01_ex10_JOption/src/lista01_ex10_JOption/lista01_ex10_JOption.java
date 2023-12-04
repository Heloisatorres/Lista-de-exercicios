package lista01_ex10_JOption;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class lista01_ex10_JOption {

	public static void main(String[] args) {
		double raio, comprimentoEsfera, areaEsfera, volumeEsfera;
	

		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
		comprimentoEsfera = 2 *  Math.PI * raio;
		areaEsfera = (float) Math.PI * (raio * raio);
		volumeEsfera = (4*  Math.PI * Math.pow(raio, 3))/3;

		JOptionPane.showMessageDialog(null,"Comprimento: " + comprimentoEsfera + "\nArea: " + areaEsfera + "\nvolume: " + volumeEsfera);


	}

}
