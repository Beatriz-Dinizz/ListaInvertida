package view;

import java.util.LinkedList;
import controller.ListaInvertida;

public class Principal {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(3);
        lista.add(5);
        lista.add(18);
        lista.add(12);
        lista.add(9);
        lista.add(7);
        lista.add(6);
        lista.add(2);
        lista.add(13);
        lista.add(4);
        lista.add(16);
        
        ListaInvertida listaInvertida = new ListaInvertida();

        System.out.println("Lista original:");
        listaInvertida.exibirLista(lista);

        listaInvertida.inverterLista(lista);

        System.out.println("Lista invertida:");
        listaInvertida.exibirLista(lista);
    }
}
