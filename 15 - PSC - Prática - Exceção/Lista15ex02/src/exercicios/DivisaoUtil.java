package exercicios;

public class DivisaoUtil {

	public static void dividir(int numerador, int denominador) throws ArithmeticException {

		if (denominador == 0) {
			throw new ArithmeticException("Não é possível dividir por zero.");
		}

		if (numerador < 0) {
			throw new ArithmeticException("O dividendo não pode ser menor que zero.");
		}

		int resultado = numerador / denominador;

		System.out.println("Resultado da divisão: " + resultado);
	}
}
