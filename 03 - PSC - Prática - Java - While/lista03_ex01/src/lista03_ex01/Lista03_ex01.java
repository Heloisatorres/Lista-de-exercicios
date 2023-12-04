package lista03_ex01;

import javax.swing.JOptionPane;

public class Lista03_ex01 {

	public static void main(String[] args) {
		int notaFinal = 0, faltas = 0, qtdAlunos90 = 0, reprovados = 0, maiorNota = 0, menorNota = 0, media = 0,
				qtdAlunos = 0, somaNotas = 0;
		boolean numeroPositivo = true;

		while (numeroPositivo) {
			notaFinal = Integer.parseInt(JOptionPane.showInputDialog("Nota final"));
			faltas = Integer.parseInt(JOptionPane.showInputDialog("Faltas"));

			somaNotas += notaFinal;
			qtdAlunos++;
			if (notaFinal >= 0) {
				if (qtdAlunos > 0) {
					media = somaNotas / qtdAlunos;
				}

				if (notaFinal < 90) {
					notaFinal++;
				}
				if (notaFinal < 70 || faltas > 20) {
					reprovados++;

				}
				if (notaFinal > maiorNota) {
					maiorNota = notaFinal;

				}

				if (notaFinal < menorNota) {
					menorNota = notaFinal;

				}
			} else {
				numeroPositivo = false;
			}

		}
		JOptionPane.showMessageDialog(null, "Notas maiores que 90: " + qtdAlunos90 + "\nReprovados: " + reprovados
				+ "\nMaior nota: " + maiorNota + "\nMenor nota:" + menorNota + "\nMedia da sala: " + media);

	}

}
