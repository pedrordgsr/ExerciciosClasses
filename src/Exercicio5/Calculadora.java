package Exercicio5;

public class Calculadora {
    int n1,n2;

    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString() {
        return String.format("Soma = " + (n1 + n2));
    }

}
