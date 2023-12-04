package lista09_ex01;

public class Retangulo {
	private float altura, largura;
	public Retangulo() {
	altura = 0;
	largura = 0;
	}
	/*retorna o atributo altura*/
	public float getAltura() {
	return (altura);
	}
	/*define o atributo altura com base no argumento passado*/
	public void setAltura(float alt) {
	altura = alt;
	}
	/*retorna o atributo largura*/
	public float getLargura() {
	return (largura);
	}
	/*define o atributo largura com base no argumento passado*/
	public void setLargura(float larg) {
	largura = larg;
	}
	/*calcula a area do retangulo e retorna esse valor*/
	public float calculaArea() {
	return altura * largura;
	}
	/*calcula o perimetro do retangulo e retorna esse valor*/
	public float calculaPerimetro() {
	return 2 * altura + 2 * largura;
	}
	/*exibe as informações desse retangulo*/
	public void exibe() {
		System.out.println("Altura:"+this.altura);
		System.out.println("Largura:"+this.largura);
		System.out.println("Area:"+this.calculaArea());
		System.out.println("Perimetro:"+this.calculaPerimetro());
	}
}
