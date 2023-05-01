package METODO_GENERICO.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] meuArray = {"Olá" , "Java", "UFMT", "Barra do Garças"};

        System.out.println("Antes: " + Arrays.toString(meuArray));

        troca(meuArray, 1, 3);

        System.out.println("Depois: " + Arrays.toString(meuArray));

        Integer[] meuArray2 = {1,2,3,4,5,6};

        System.out.println("Antes: " + Arrays.toString(meuArray2));

        troca(meuArray2, 2, 4);

        System.out.println("Depois: " + Arrays.toString(meuArray2));

    }

    //Método genérico
    public static <T> void troca(T[] array, int i, int j) {
        T aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
