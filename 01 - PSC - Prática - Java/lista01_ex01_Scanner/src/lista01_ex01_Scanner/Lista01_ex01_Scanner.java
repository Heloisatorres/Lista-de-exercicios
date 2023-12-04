package lista01_ex01_Scanner;

import java.util.Scanner;

public class Lista01_ex01_Scanner {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2, nota3;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = teclado.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = teclado.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = teclado.nextFloat();

		float mediaAritimetica = ((nota1 + nota2 + nota3) / 3);

		System.out.println(mediaAritimetica);

	}

}
