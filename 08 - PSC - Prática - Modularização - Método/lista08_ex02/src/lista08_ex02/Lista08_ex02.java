package lista08_ex02;

import java.util.Scanner;

public class Lista08_ex02 {

	public static void main(String[] args) {
		Soma s = new Soma();
		Scanner t = new Scanner(System.in);

		System.out.println("Deseja adicionar um valor(S/N)? \nValor atual R$ "+s.soma(0));
		String continuar = t.next();
		while (continuar.equalsIgnoreCase("s")) {
			System.out.println("Qual valor deseja adicionar?");
			s.soma(t.nextFloat());
			System.out.println("Deseja somar mais um valor(S/N) \nValor atual R$ "+s.soma(0));
			 continuar = t.next();
		}
		System.out.println("Valor FINAL R$ "+s.soma(0)+"\n");

		t.close();
	}

}
