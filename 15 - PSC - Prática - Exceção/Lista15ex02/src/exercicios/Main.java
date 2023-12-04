package exercicios;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();

            DivisaoUtil.dividir(numerador, denominador);

        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());

        } finally {
            scanner.close(); 
        }
    }
}
