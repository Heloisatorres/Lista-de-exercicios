package lista01_ex04_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex04_JOption {

	public static void main(String[] args) {
		float salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário atual do funcionário em R$"));
		float salarioComAumento = salarioFuncionario * (float) 1.25;

		JOptionPane.showMessageDialog(null,"O salário do funcionário aumentou em 25% e agora é: R$ " + salarioComAumento);

	}

}
