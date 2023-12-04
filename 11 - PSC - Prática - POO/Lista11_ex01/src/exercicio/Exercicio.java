package exercicio;

public class Exercicio {
	public static void main(String[] args) {
        Produto produto1 = new Produto("Smartphone", 1200.0);
        Produto produto2 = new Produto("Tablet", 700.0);
        Produto produto3 = new Produto();
        produto3.setNome("Monitor");
        produto3.setPreco(200.0);

        System.out.println("ID: " + produto1.getId() + ", Nome: " + produto1.getNome() + ", Preço: " + produto1.getPreco());
        System.out.println("ID: " + produto2.getId() + ", Nome: " + produto2.getNome() + ", Preço: " + produto2.getPreco());
        System.out.println("ID: " + produto3.getId() + ", Nome: " + produto3.getNome() + ", Preço: " + produto3.getPreco());
    }
}
