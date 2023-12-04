package lista02_ex09;

import java.util.Scanner;

public class Lista02_ex09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qual o planeta? ");
		String planeta = teclado.next().toUpperCase();

		float gravidade, vZero, t, v, h;
		System.out.print("v0 ");
		vZero = teclado.nextFloat();
		System.out.print("t ");
		t = teclado.nextFloat();

		switch (planeta) {
		case "MERCURIO":
			gravidade = (float) 3.7;
			break;
		case "VENUS":
			gravidade = (float) 8.8;
			break;
		case "TERRA":
			gravidade = (float) 9.8;
			break;
		case "MARTE":
			gravidade = (float) 3.8;
			break;
		case "JUPITER":
			gravidade = (float) 26.4;
			break;
		case "SATURNO":
			gravidade = (float) 11.5;
			break;
		case "URANO":
			gravidade = (float) 9.3;
			break;
		case "NETUNO":
			gravidade = (float) 12.2;
			break;
		case "PLUTAO":
			gravidade = (float) 0.6;
			break;

		default:
			gravidade = (float) 9.8;
			break;

		}
		v = vZero - (gravidade * t);
		h = (float) ((vZero * t) - ((gravidade * Math.pow(t, 2)/2)));

		System.out.println("v(t) = " + v);
		System.out.println("h(t) = " + h);

	}

}
