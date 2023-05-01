package Listas.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //
        //LinkedList<Funcionario> lista1 = new LinkedList<>();
        ArrayList<Funcionario> lista1 = new ArrayList<>();
        lista1.add(new Funcionario("André", 1000));
        lista1.add(new Funcionario("André Junior", 1000));

        for (Funcionario f : lista1) {
            System.out.println(f.getNome());
        }

        /*
         * forEach recebe Consumer como parametro, e ele deve ser implementado,
         * pois ele é uma interface
        */
        lista1.forEach(e->System.out.println(e.getNome()));

        // Iterator de java.util.Iterator
        Iterator<Funcionario> it = lista1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().getNome());
        }


    }
}
