package Exercicio2;

public class Carro {
	private String marca;
	private int ano;
	
	public Carro(String marca, int ano) {
		this.marca = marca;
		this.ano = ano;
	}
	
	public void getCarro() {
		System.out.printf("%s, %d \n",marca,ano);
	}
	
	
}
