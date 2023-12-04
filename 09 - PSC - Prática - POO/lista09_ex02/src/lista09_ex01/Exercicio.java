package lista09_ex01;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a altura do retângulo: ");
		ret.setAltura(input.nextFloat());
		System.out.print("Informe a largura do retângulo: ");
		ret.setLargura(input.nextFloat());
		System.out.println("A area é: " + ret.calculaArea());
		System.out.println("O perimetro é: " + ret.calculaPerimetro());
		ret.exibe();
	}
}
