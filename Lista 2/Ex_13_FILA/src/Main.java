package Ex_13_FILA.src;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.add("a");
        fila.add("b");
        fila.add("c");
        fila.add("d");

        fila.show();
        System.out.println();

        Fila.Iterator fl = new Fila.Iterator();

        fl.hasNext();
    }
}
