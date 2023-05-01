package Ex_12_FILA.src;

public class Main {
    public static void main(String[] args) {
        Fila f = new Fila();

        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        f.add("e");

        System.out.println("Fila está vazia? " + f.empty());

        System.out.println();
        System.out.println("Fila: " + f.getTamanho());
        f.show();

        
        System.out.println();
        f.rm();
        System.out.println("Fila dps da remoção: " + f.getTamanho());
        f.show();

        System.out.println();
        f.rm();
        System.out.println("Fila dps da remoção: " + f.getTamanho());
        f.show();

        System.out.println();
        f.rm();
        System.out.println("Fila dps da remoção: " + f.getTamanho());
        f.show();

        System.out.println();
        f.rm();
        System.out.println("Fila dps da remoção: " + f.getTamanho());
        f.show();
    }
}
