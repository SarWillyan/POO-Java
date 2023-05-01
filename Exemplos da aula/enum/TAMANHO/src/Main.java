package TAMANHO.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tamanho t1 = Tamanho.GRANDE;
        Tamanho t2 = Tamanho.MEDIO;
        Tamanho t3 = Tamanho.PEQUENO;
        
        System.out.println("Vaiáveis: " + t1 + " " + t2 + " " + t3);

        System.out.println("\narrayT");

        Tamanho[] arrayT = Tamanho.values(); // arrayT recebe tudo através de .values() que é herdado de enum
        for (Tamanho t: arrayT) System.out.println("\t" + t);

        System.out.println();

        for (Tamanho t: arrayT) {
            System.out.println("\t" + t);
            System.out.println("\t" + t.ordinal()); //retorna a posição através de .ordinal() que é herdado de enum
        }

        System.out.println("\narrayT2 desordenado");

        Tamanho[] arrayT2 = {t1, t2, t3};
        for (Tamanho t: arrayT2) System.out.println("\t" + t);

        System.out.println();

        for (Tamanho t: arrayT2) {
            System.out.println("\t" + t);
            System.out.println("\t" + t.ordinal()); //retorna a posição através de .ordinal() que é herdado de enum
        }

        System.out.println("\narrayT2 ordenado");
        Arrays.sort(arrayT2); // É possivel, pois enum implementa comparator
        for (Tamanho t: arrayT2) {
            System.out.println("\t" + t);
            System.out.println("\t" + t.ordinal()); //retorna a posição através de .ordinal() que é herdado de enum
        }
    }
}
