package exercicio;
public class Inteiro {

    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        int resultado = 0;
        int restante = a;
        while (restante >= b) {
            restante -= b;
            resultado++;
        }
        return resultado;
    }

    public int resto(int a, int b) {
        int restante = a;
        while (restante >= b) {
            restante -= b;
        }
        return restante;
    }

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }
}
