package lista17_ex01;

public class Ordenacao {
	public int[] bubbleSort(int[] v) {
		int i, fim, aux;
		for (fim = v.length - 1; fim > 0; fim--) {
			for (i = 0; i < fim; i++) {
				if (v[i] > v[i + 1]) {
					aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
				}
			}
		}
		return v;
	}

	public void selectionSort(int[] v) {
		int n = v.length;
		int i, j, min, aux;
		for (i = 0; i < n - 1; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {
				if (v[j] < v[min]) {
					min = j;
				}
			}
			if (v[i] != v[min]) {
				aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			}
		}

	}

	void insertionSort(int[] v) {
		int n = v.length;
		int i = 0;
		int j = 1;
		int aux = 0;

		while (j < n) {
			aux = v[j];
			i = j - 1;

			while (i >= 0 && v[i] > aux) {
				v[i + 1] = v[i];
				i = i - 1;
			}

			v[i + 1] = aux;
			j = j + 1;
		}
	}

}
