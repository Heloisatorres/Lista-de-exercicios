package lista01_ex02_JOption;

import javax.swing.JOptionPane;

public class Nascimento {

	public static void main(String[] args) {

		String anoNascimento, anoAtual;
		int nascimento, atual, idadeAtual, idade2050;

		anoNascimento = JOptionPane.showInputDialog("Digite o ano de nascimento");
		nascimento = Integer.parseInt(anoNascimento);

		anoAtual = JOptionPane.showInputDialog("Digite o ano atual");
		atual = Integer.parseInt(anoAtual);

		idadeAtual = atual - nascimento;
		idade2050 = 2050 - nascimento;

		JOptionPane.showMessageDialog(null, "Idade atual " + idadeAtual);
		JOptionPane.showMessageDialog(null, "Idade em 2050 " + idade2050);

	}

}
