package lista01_ex06_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex06_JOption {

	public static void main(String[] args) {
		float celsius, fahrenheit;

		celsius = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura em celsius"));

		fahrenheit = (celsius * (float) 1.8) + 32;
		JOptionPane.showMessageDialog(null, "celsius: " + celsius + " graus\nFahrenheit: " + fahrenheit+" graus");
	}

}
