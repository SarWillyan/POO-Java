package Ex_8.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Josvaldo");
        nomes.add("Eliezer");
        nomes.add("Linder");
        nomes.add("Tomas");

        ordenaNaSorte(nomes, (String s1, String s2) -> s1.compareToIgnoreCase(s2) );

        System.out.println(nomes.toString());
    }

    public static void ordenaNaSorte(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> aux = new ArrayList<>(strings);

        Collections.sort(aux, comp);
        //lembrete: não foi usado o Arrays.sort pois ele não aceitou o "comp"

        while (aux.equals(strings) != true) Collections.shuffle(strings);

        /* trocar pelo while
        if (aux.equals(strings) != true) {
            Collections.shuffle(strings);
            ordenaNaSorte(strings, comp);
        }
        */
    }
}
