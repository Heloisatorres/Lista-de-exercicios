import java.util.Scanner;

public class Lista01_ex06_Scanner {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float celsius, fahrenheit;
		System.out.print("Digite a temperatura em graus celsius ");
		celsius = teclado.nextFloat();
		fahrenheit = (celsius * (float) 1.8) + 36;

		System.out.print(celsius + " graus celsius" + "\n" + fahrenheit + " graus fahrenheit");

	}

}
