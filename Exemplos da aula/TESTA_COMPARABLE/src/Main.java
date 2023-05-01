package TESTA_COMPARABLE.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"Linder", "Candido", "Silva", "UFMT"};
        Pessoa[] pessoas = new Pessoa[4];

        pessoas[0] = new Pessoa("Linder Candido", 3);
        pessoas[1] = new Pessoa("Maria L.", 5);
        pessoas[2] = new Pessoa("Luiza Maria", 1);
        pessoas[3] = new Pessoa("Anita do Funk", 2);

        // A classe String implementa a interface Comparable<T>
        
        System.out.println();
        System.out.println("Em ordem alfabética");
        Arrays.sort(array1);
        for (String s: array1) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Em ordem de tamanho");
        Arrays.sort(array1, new CompString());
        for (String s: array1) {
            System.out.println(s);
        }
        
        System.out.println();
        System.out.println("Ordena as instancias da classe Pessoa");
        Arrays.sort(pessoas);
        for (Pessoa p: pessoas) {
            System.out.println("Nome: " + p.getNome() + " " + "ID: " + p.getId());
        }
    }
}
