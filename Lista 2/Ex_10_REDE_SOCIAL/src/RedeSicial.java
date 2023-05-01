package Ex_10_REDE_SOCIAL.src;

import java.util.ArrayList;

public class RedeSicial {
    public class Membro {
        private String nome;
        private int id;
        private static int nextId = 0;
        ArrayList<Membro> amigos;

        // Construtor
        public Membro() {}
        public Membro(String nome) {
            this.nome = nome;
            this.id = nextId;
            nextId++;
            amigos = new ArrayList<>();
        }

        public void addAmigo(Membro friend) {
            if (getId() != friend.getId()){
                if (!amigos.contains(friend)) {
                    amigos.add(friend);
                } else {
                    System.out.println("Já são amigos!");
                }
            } else {
                System.out.println("Não é possivel se adicionar como amigo!");
            }
        }
        
        public void showFriends() {
            System.out.println("\tAmigos: ");
            for (Membro a: amigos) {
                System.out.println("\tNome: " + a.getNome() + " ID: " + a.getId());
            }
        }
        
        //getters and setters
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        // Desativa membro
        public void desativar() {
            RedeSicial.this.membros.remove(this);
        }

    }//fim da classe Membro

    ArrayList<Membro> membros = new ArrayList<>();

    // Metodos
    public Membro addMembro(String nome) {
        Membro novo = new Membro(nome);
        this.membros.add(novo);
        return novo;
    }

    public void show() {
        for (Membro m: membros) {
            System.out.println("Nome: " + m.getNome() + " ID: " + m.getId());
            m.showFriends();
        }
    }
}
