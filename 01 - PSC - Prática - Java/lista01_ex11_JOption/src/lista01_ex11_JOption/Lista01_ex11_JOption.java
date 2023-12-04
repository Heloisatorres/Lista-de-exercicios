package lista01_ex11_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex11_JOption {

	public static void main(String[] args) {
		int numero;
		String acumulador ="";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")) ;
		
		for (int i = 0; i <=10 ; i++) {
			acumulador += numero+" X "+i+" = "+numero*i+"\n";
			
		}
		JOptionPane.showMessageDialog(null,acumulador);
	}

}
