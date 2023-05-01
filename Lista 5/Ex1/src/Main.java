package Ex1.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> v1 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> v2 = new ArrayList<>(List.of(4, 5, 6));
        
        System.out.println("? extends E: " + junta1(v1, v2));
        System.out.println("? super E: " + junta2(v1, v2));
    }

    // Com um ? extends E
    public static <E> ArrayList<E> junta1(ArrayList<? extends E> array1, ArrayList<E> array2) {
        ArrayList<E> resultado = new ArrayList<>();
        resultado.addAll(array1);
        resultado.addAll(array2);
        return resultado;
    }

    // Uma com ? super E
    public static <E> ArrayList<?> junta2(ArrayList<? super E> array1, ArrayList<E> array2) {
        ArrayList<Object> resultado = new ArrayList<>();
        resultado.addAll(array1);
        resultado.addAll(array2);
        return resultado;
    }
}
