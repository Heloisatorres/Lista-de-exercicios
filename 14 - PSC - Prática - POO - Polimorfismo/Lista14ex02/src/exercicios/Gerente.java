package exercicios;
public class Gerente extends Empregado {
    private String nomeSecretaria;

    public Gerente(String nome, double salario, int anoContratacao) {
        super(nome, salario, anoContratacao);
        nomeSecretaria = "";
    }

    @Override
    public void reajustaSalario(double porcentagem) {
        
        double bonus = (ANO_BASE - getAnoContratacao());
        super.reajustaSalario(porcentagem + bonus);
    }
}
