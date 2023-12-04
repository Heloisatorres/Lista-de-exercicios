package lista02_ex14;

import javax.swing.JOptionPane;

public class Lista02_ex14 {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite o comando git").toLowerCase();

		if (entrada.equals("git clone")) {

			JOptionPane.showMessageDialog(null,
					"Git Clone: Clona um repositório de um servidor remoto para a sua máquina local, criando uma cópia com todas as ramificações e histórico de commits.");

		} else if (entrada.equals("git fetch")) {

			JOptionPane.showMessageDialog(null,
					"Git Fetch:  Baixa objetos e referências de um repositório remoto para o seu repositório local, sem mesclar automaticamente com o seu branch de trabalho. Útil para revisar mudanças antes de mesclar.");

		} else if (entrada.equals("git pull")) {

			JOptionPane.showMessageDialog(null,
					"Git Pull: Obtém alterações de um repositório remoto e as mescla automaticamente em seu branch atual. É uma combinação de git fetch e git merge, geralmente usado para atualizar seu branch local com alterações do branch remoto.");

		}

	}

}
