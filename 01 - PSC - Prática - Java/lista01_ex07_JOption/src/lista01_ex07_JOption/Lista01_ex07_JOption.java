package lista01_ex07_JOption;

import javax.swing.JOptionPane;

public class Lista01_ex07_JOption {

	public static void main(String[] args) {
	float salarioFuncionario,salarioMinimo,qtdSalarios;

	salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do funcionario em R$"));
	
	salarioMinimo = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do minimo em R$"));
	
	qtdSalarios = salarioFuncionario / salarioMinimo;
	
	JOptionPane.showMessageDialog(null,"O funcionario recebe "+(int)qtdSalarios+" salarios minimos");
	
	}

}
