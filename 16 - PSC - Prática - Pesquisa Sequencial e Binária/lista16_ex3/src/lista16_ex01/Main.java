package lista16_ex01;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int[] sequenciaA = lerSequencia(scanner, "A");
        int[] sequenciaB = lerSequencia(scanner, "B");

      
        System.out.println("\nSequência A: " + Arrays.toString(sequenciaA));
        System.out.println("Sequência B: " + Arrays.toString(sequenciaB));


        int[] conjuntoA = gerarConjunto(sequenciaA);
        int[] conjuntoB = gerarConjunto(sequenciaB);
        int[] conjuntoC = uniaoConjuntos(conjuntoA, conjuntoB);

      
        System.out.println("\nConjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
        System.out.println("Conjunto C (A U B): " + Arrays.toString(conjuntoC));

        scanner.close();
    }


    private static int[] lerSequencia(Scanner scanner, String nomeSequencia) {
        System.out.print("Informe a quantidade de elementos na sequência " + nomeSequencia + ": ");
        int tamanho = scanner.nextInt();

        int[] sequencia = new int[tamanho];
        System.out.println("Informe os elementos da sequência " + nomeSequencia + ":");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            sequencia[i] = scanner.nextInt();
        }

        Arrays.sort(sequencia);

        return sequencia;
    }

   
    private static int[] gerarConjunto(int[] sequencia) {
        int[] conjunto = new int[sequencia.length];
        int tamanhoConjunto = 0;

        for (int i = 0; i < sequencia.length; i++) {
            if (i == 0 || sequencia[i] != sequencia[i - 1]) {
                conjunto[tamanhoConjunto++] = sequencia[i];
            }
        }

      
        return Arrays.copyOf(conjunto, tamanhoConjunto);
    }

    
    private static int[] uniaoConjuntos(int[] conjuntoA, int[] conjuntoB) {
        int[] conjuntoC = new int[conjuntoA.length + conjuntoB.length];
        int tamanhoConjuntoC = 0;

        for (int i = 0; i < conjuntoA.length; i++) {
            conjuntoC[tamanhoConjuntoC++] = conjuntoA[i];
        }

        for (int i = 0; i < conjuntoB.length; i++) {
            if (pesquisaBinaria(conjuntoA, conjuntoB[i]) == -1) {
                conjuntoC[tamanhoConjuntoC++] = conjuntoB[i];
            }
        }

        return Arrays.copyOf(conjuntoC, tamanhoConjuntoC);
    }

   
    private static int pesquisaBinaria(int[] vetor, int elemento) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == elemento) {
                return meio; 
            } else if (vetor[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; 
    }
}

