package Exercicio6;

public class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    }
    
    public void imprimirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    }
   }
