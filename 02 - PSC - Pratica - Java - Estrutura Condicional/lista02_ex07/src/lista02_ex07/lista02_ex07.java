package lista02_ex07;

import java.util.Scanner;

public class lista02_ex07 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		float a, b, c, delta = 0, x = 0, x1 = 0;
		String resultado = null;
		System.out.println("Digite o valor de a");
		a = t.nextInt();
		System.out.println("Digite o valor de b");
		b = t.nextInt();
		System.out.println("Digite o valor de c");
		c = t.nextInt();

		delta = (int) (Math.pow(b, 2) - 4 * a * c);

		if (a == 0 && b == 0 && c == 0) {
			resultado = "Igualdade confirmada: 0 = 0";
		} else if (a == 0 && b == 0 && c != 0) {
			resultado = "Coeficientes informados incorretamente";
		} else if (a == 0 && b != 0) {
			x = (-c / b);
			resultado = "Esta é uma equação de primeiro grau: x= " + x;

		} else {

			if (delta < 0) {
				resultado = "Esta é uma equação de segundo grau\nEsta equação não possui raízes reais (delta < 0): delta="
						+ delta;
			} else if (delta == 0) {
				x = ((b * -1) / (a * 2));
				resultado = "Esta é uma equação de segundo grau.\nEsta equação possui duas raízes reais iguais: x'= x''= "
						+ x;

			} else if (delta > 0) {
				x = (float) ((b * -1) + Math.sqrt(delta)) / (2 * a);
				x1 = (float) ((b * -1) - Math.sqrt(delta)) / (2 * a);
				
				resultado = "Esta é uma equação de segundo grau.\nEsta equação possui duas raízes reais diferentes: delta= "
						+ delta + " x'= " + String.format("%.2f", x) + " x''= " + String.format("%.2f", x1);

			}

		}

		System.out.println(resultado);

	}

}
