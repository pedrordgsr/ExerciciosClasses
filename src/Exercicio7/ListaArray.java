package Exercicio7;

public class ListaArray {
        int[] lista = new int[5];
        
        public ListaArray() {
            for(int i = 0; i < lista.length; i++) {
                lista[i] = i;
            }
        }

        public void imprimirLista(){
            for(int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        }

}
