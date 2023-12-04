package lista03_ex03;

import java.util.ArrayList;
import java.util.Scanner;


	public class Lista03_ex03 {

	    public static class Pair {
	        int canal;
	        int audiencia;

	        public Pair(int canal, int audiencia) {
	            this.canal = canal;
	            this.audiencia = audiencia;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Pair> canais_e_audiencia = new ArrayList<>();

	        while (true) {
	            System.out.print("Digite o número do canal (2, 4, 5, 7, 12) ou 0 para encerrar: ");
	            int canal = scanner.nextInt();
	            if (canal == 0) {
	                break;
	            }
	            System.out.print("Digite o número de pessoas assistindo ao canal: ");
	            int audiencia = scanner.nextInt();
	            canais_e_audiencia.add(new Pair(canal, audiencia));
	        }

	        calculateAndPrintPercentages(canais_e_audiencia);
	    }

	    public static void calculateAndPrintPercentages(ArrayList<Pair> canais_e_audiencia) {
	        int totalAudiencia = 0;

	        for (Pair pair : canais_e_audiencia) {
	            totalAudiencia += pair.audiencia;
	        }

	       
}}
