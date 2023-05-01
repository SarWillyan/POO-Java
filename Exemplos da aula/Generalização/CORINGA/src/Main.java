package CORINGA.src;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Exemplos de uso do "?" usando a classe Funcionário
 * ? extends (nome da classe) -> aceita qualquer coisa que herde Funcionário
 * ? super (nome da classe) -> aceita qualquer coisa que seja superior ao Funicionário, ou seja, que Funionário esteja herdando
 */

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> lista = new ArrayList<>(List.of(new Funcionario("João", 1001.0f), 
                                                               new Funcionario("Bastião", 2000.0f)));
        processaFunc(lista);

        printAll(lista, (Funcionario f) -> f.getSalario() > 1000.0f);

        ArrayList<Gerente> lista2 = new ArrayList<>(List.of(new Gerente("João", 1001.0f, "Empresário"), 
                                                            new Gerente("Bastião", 2000.0f, "Atendente")));
        processaFunc(lista2);
    }

    // "? super" -> aceita qualquer coisa que seja superior ao Funicionário 
    public static void printAll(ArrayList<Funcionario> staff, Predicate<? super Funcionario> teste) {
        for (Funcionario f: staff) {
            if(teste.test(f)){
                System.out.println(f);
            }
        }
    }

    // ? -> é o coringa
    public static void  processaFunc(ArrayList< ? extends Funcionario> staff) {
        for (Funcionario f: staff){
            System.out.println("Nome: " + f.getNome());
        }
    }
}
