package lista16_ex01;
import java.util.Scanner;
public class Main {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        int[] vetor = new int[10];
	        System.out.println("Informe 10 números:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        while (true) {
	            System.out.println("\nEscolha o algoritmo de busca:");
	            System.out.println("1 - Busca Sequencial");
	            System.out.println("2 - Busca Sequencial com Sentinela");
	            System.out.println("0 - Sair");

	            int escolha = scanner.nextInt();

	            if (escolha == 0) {
	                System.out.println("Encerrando o programa.");
	                break;
	            }

	            System.out.print("Informe o número a ser pesquisado: ");
	            int numeroBuscado = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    buscaSequencial(vetor, numeroBuscado);
	                    break;
	                case 2:
	                    buscaSequencialComSentinela(vetor, numeroBuscado);
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }

	        scanner.close();
	    }

	    private static void buscaSequencial(int[] vetor, int numeroBuscado) {
	        int comparacoes = 0;
	        for (int i = 0; i < vetor.length; i++) {
	            comparacoes++;
	            if (vetor[i] == numeroBuscado) {
	                System.out.println("Número encontrado na posição " + i + ". Comparações realizadas: " + comparacoes);
	                return;
	            }
	        }
	        System.out.println("Número não encontrado. Comparações realizadas: " + comparacoes);
	    }

	
	    private static void buscaSequencialComSentinela(int[] vetor, int numeroBuscado) {
	        int comparacoes = 0;

	        int tamanho = vetor.length;
	        int sentinela = vetor[tamanho - 1];
	        vetor[tamanho - 1] = numeroBuscado;

	        int i = 0;
	        while (vetor[i] != numeroBuscado) {
	            comparacoes++;
	            i++;
	        }

	        
	        vetor[tamanho - 1] = sentinela;

	        if (i < tamanho - 1) {
	            System.out.println("Número encontrado na posição " + i + ". Comparações realizadas: " + comparacoes);
	        } else {
	            System.out.println("Número não encontrado. Comparações realizadas: " + comparacoes);
	        }
	    }
	}


