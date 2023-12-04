package exercicio;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[10];
		int[] vetor1 = new int[vetor.length];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor " + (i + 1) + " do vetor:");
			vetor[i] = scanner.nextInt();
		}

		System.out.println("Selecione o método de ordenação desejado:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Insertion Sort");
		System.out.println("4. Quick Sort");
		System.out.println("5. Merge Sort");

		int opcao = scanner.nextInt();

		Ordenacao ordenacao = new Ordenacao();

		switch (opcao) {
		case 1:
			vetor = ordenacao.bubbleSort(vetor);
			break;
		case 2:
			ordenacao.selectionSort(vetor);
			break;
		case 3:
			ordenacao.insertionSort(vetor);
			break;
		case 4:
			ordenacao.quickSort(vetor, 0, vetor.length - 1);
			break;
		case 5:
			ordenacao.mergeSort(vetor, vetor1, 0, vetor.length - 1);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

		System.out.println("Vetor ordenado:");
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}

		scanner.close();
	}
}
