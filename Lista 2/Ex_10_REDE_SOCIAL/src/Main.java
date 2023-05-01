package Ex_10_REDE_SOCIAL.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RedeSicial novoInsta = new RedeSicial();

        ArrayList<RedeSicial.Membro> membros = new ArrayList<>();

        membros.add(novoInsta.addMembro("Juliete Borges"));
        membros.add(novoInsta.addMembro("Karol Conk"));
        membros.add(novoInsta.addMembro("José Neto"));
        membros.add(novoInsta.addMembro("Camila Suzane"));
        membros.add(novoInsta.addMembro("Conceição das Neves"));

        System.out.println("\nAntes da remoção");
        membros.get(0).addAmigo(membros.get(1));
        membros.get(0).addAmigo(membros.get(2));
        membros.get(1).addAmigo(membros.get(0));
        membros.get(2).addAmigo(membros.get(0));
        membros.get(0).addAmigo(membros.get(1));
        novoInsta.show();

        //System.out.println("\nDepois da remoção");
        //novoInsta.membros.remove(0);
        //novoInsta.show();
    }
}
