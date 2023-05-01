package Ex7.src;

import java.util.Arrays;

public class Pilha_O {
    private Object array[] = new Object[3];
    private int indice = 0;

    public void push(Object elemento) {
        if (indice < array.length){
            array[indice++] = elemento;
        } else {
            array = Arrays.copyOf(array, array.length*2);
            array[indice++] = elemento;
        }
    }

    public Object pop() {
        return array[--indice];
    }

    public void show() {
        int aux = indice;
        while (--aux >= 0)
            System.out.println(array[aux]);
        System.out.println();
    }
}
