package lista02_ex11;

import java.util.Scanner;

public class lista02_ex11 {

	public static void main(String[] args) {
		int diarias;
		float taxaServico, total;
		Scanner t = new Scanner(System.in);
		System.out.print("Diarias: ");

		diarias = t.nextInt();

		if (diarias < 15) {

			taxaServico = (float) 15;

		} else if (diarias == 15) {

			taxaServico = (float) 10;
		} else {
			taxaServico = (float) 5;
		}

		total = 500 + (diarias * taxaServico);
		System.out.println("Total R$: " + String.format("%.2f", total));
	}

}
