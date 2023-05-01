package CLASSE_GENERICA.src;

public class Main {
    public static void main(String[] args) {
        Entrada<Integer, String> e1 = new Entrada<>(1, "Prog 3");

        System.out.println("Chave: " + e1.getChave());
        System.out.println("Valor: " + e1.getValor());
    }
}
