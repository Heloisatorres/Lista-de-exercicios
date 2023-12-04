package lista01_ex10_Scanner;

import java.util.Scanner;

public class Lista01_ex10_Scanner {

	public static void main(String[] args) {
		double raio, comprimentoEsfera, areaEsfera, volumeEsfera;
		Scanner t = new Scanner(System.in);

		System.out.print("Digite o raio da esfera ");
		raio = t.nextFloat();
		comprimentoEsfera = 2 *  Math.PI * raio;
		areaEsfera = (float) Math.PI * (raio * raio);
		volumeEsfera = (4*  Math.PI * Math.pow(raio, 3))/3;

		System.out.print("Comprimento: " + comprimentoEsfera + "\nArea: " + areaEsfera + "\nvolume: " + volumeEsfera);

	}

}
