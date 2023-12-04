package lista02_ex13;

import java.util.Scanner;

public class Lista02_ex13 {

	public static void main(String[] args) {
		int dias;
		float preco = 0, total;
		String tipo;
		Scanner t = new Scanner(System.in);

		System.out.print("Dias: ");
		dias = t.nextInt();

		System.out.print("Apto(simples/duplo): ");
		tipo = t.next().toLowerCase();
		if (tipo.equals("simples")) {
			if (dias < 10) {

				preco = (float) 100;

			} else if (dias <= 15) {

				preco = (float) 90;
				
			} else if (dias > 15) {
				
				preco = (float) 80;
			}
		}else if (tipo.equals("duplo")) {
			
			if (dias < 10) {

				preco = (float) 140;

			} else if (dias <= 15) {

				preco = (float) 120;
				
			} else if (dias > 15) {
				preco = (float) 100;
				
			}
		}

		total = (dias * preco);
		System.out.println("Total R$: " + String.format("%.2f", total));

	}

}
