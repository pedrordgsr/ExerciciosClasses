package Exercicio8;

public class Retangulo {

	private Double largura;
	private Double altura;
	
	public Retangulo() {
		
	}
	
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
		
	public void calcularArea() {
		Double area = largura * altura;		
			System.out.printf("%f", area);
		
		}
	}
	

