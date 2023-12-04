package exercicios;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empregado empregado1 = new Empregado("João", 3000.0, 2020);
        Gerente gerente1 = new Gerente("Maria", 5000.0, 2018);
        Diretor diretor1 = new Diretor("Carlos", 8000.0, 2015, "Financeiro");

        empresa.adicionaEmpregado(empregado1);
        empresa.adicionaEmpregado(gerente1);
        empresa.adicionaEmpregado(diretor1);

        System.out.println("Lista de empregados antes do reajuste:");
        System.out.println(empresa.mostrEmpregados());

        empresa.reajustaSalarios(10); // Reajuste de 10%

        System.out.println("\nLista de empregados após o reajuste:");
        System.out.println(empresa.mostrEmpregados());
    }
}
