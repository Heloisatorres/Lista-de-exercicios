package lista01_ex03_Scanner;

import java.util.Scanner;

public class Lista03_ex03_Scanner {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira o valor em dolares ");
		float valorEmDolares = teclado.nextFloat();
		
		System.out.print("Insira a cotação do Dolar ");
		float cotacaoDolar = teclado.nextFloat();
		
		float valorEmReais = valorEmDolares * cotacaoDolar;
		System.out.print("O valor em reais é R$:"+valorEmReais);

		
		

	}

}
