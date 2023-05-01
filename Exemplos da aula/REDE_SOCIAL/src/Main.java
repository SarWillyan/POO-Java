package REDE_SOCIAL.src;

public class Main {
    public static void main(String[] args) {
        RedeSicial novoInsta = new RedeSicial();

        RedeSicial.Membro m1 =  novoInsta.addMembro("Linder", 1);
        RedeSicial.Membro m2 =  novoInsta.addMembro("Maria", 2);
        RedeSicial.Membro m3 =  novoInsta.addMembro("Carlos", 3);
        RedeSicial.Membro m4 =  novoInsta.addMembro("Lucas", 4);

        System.out.println("Antes da remoção");
        novoInsta.show();

        System.out.println("Depois da remoção");
        m1.desativar();
        m2.desativar();
        m3.desativar();
        m4.desativar();
        novoInsta.show();
    }
}
