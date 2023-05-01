package INTERFACE_FUNCIONAL.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*String[] meuArray = {"UFMT CUA", "Prog III", "Linder Candido da Silva"};

        Arrays.sort(meuArray);

        for (String s: meuArray) {
            System.out.println("Nome: " + s);
        }
        System.out.println();

        Arrays.sort(meuArray, (String o1, String o2) -> o1.length() - o2.length());

        for (String s: meuArray) {
            System.out.println("Nome: " + s);
        }*/

        ArrayList<String> meuArray = new ArrayList<>();

        meuArray.add("Linder Candido");
        meuArray.add("UFMT CUA");
        meuArray.add("Barra do Garças");

        meuArray.set(1, null);

        for (String s: meuArray) {
            System.out.println("Nome: " + s);
        }
        System.out.println();

        meuArray.removeIf((String t) -> t == null);

        for (String s: meuArray) {
            System.out.println("Nome: " + s);
        }
    }
}
