package LISTADEPESSOAS.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("linder", 35));
        lista.add(new Pessoa("maria", 17));
        lista.add(new Pessoa("max", 37));

        printPessoas(lista, (Pessoa p)-> p.getIdade() >= 18);
        
    }

    public static void printPessoas(ArrayList<Pessoa> lista, TestaPessoa t) {
        for (Pessoa p: lista) {
            if (t.testa(p)) {
                System.out.println("Nome: " + p.getNome() + " Idade: " + p.getIdade());
            }
        }
    }
}
