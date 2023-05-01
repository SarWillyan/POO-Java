package HAS_MAP.src;

import java.util.HashMap;

import Listas.src.Funcionario;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Funcionario> lista = new HashMap<>();

        lista.put(111, new Funcionario("João", 15000.0f));
        lista.put(222, new Funcionario("Zézinho", 25000.0f));

        lista.forEach((u, v)-> System.out.println(v.getNome()));

        for (Integer x : lista.keySet()) {
            System.out.println(lista.get(x).getNome());
        }

        
    }
}
