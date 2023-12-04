package lista16_ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int[] vetor = new int[10];
        System.out.println("Informe 10 números ordenados:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

    
        Arrays.sort(vetor);

        while (true) {
            System.out.println("\nEscolha o número a ser pesquisado (ou 0 para sair): ");
            int numeroBuscado = scanner.nextInt();

            if (numeroBuscado == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            buscaBinaria(vetor, numeroBuscado);
        }

        scanner.close();
    }

 
    private static void buscaBinaria(int[] vetor, int numeroBuscado) {
        int comparacoes = 0;
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            comparacoes++;
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == numeroBuscado) {
                System.out.println("Número encontrado na posição " + meio + ". Comparações realizadas: " + comparacoes);
                return;
            } else if (vetor[meio] < numeroBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Número não encontrado. Comparações realizadas: " + comparacoes);
    }
}
