package controller;

import java.util.LinkedList;

public class ListaInvertida {

    public void inverterLista(LinkedList<Integer> lista) {
        int i = 0;
        int j = lista.size() - 1;

        while (i < j) {
            int temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
            
            i++;
            j--;
        }
    }
    
    public void exibirLista(LinkedList<Integer> lista) {
        System.out.println(lista);
    }
}
