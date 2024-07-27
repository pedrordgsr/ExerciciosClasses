package Exercicio4;

public class Aluno {
	private String nome;
	private Double nota;
	
	public Aluno(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public void imprimirDados() {
		System.out.printf("A nota do aluno %s é %f",nome,nota);
	}

}
