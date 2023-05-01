package REDE_SOCIAL.src;

import java.util.ArrayList;

public class RedeSicial {
    public class Membro {
        private String nome;
        private int id;
        ArrayList<Membro> amigos;

        // Construtor
        public Membro(String nome, int id) {
            this.nome = nome;
            this.id = id;
            amigos = new ArrayList<>();
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
    public Membro addMembro(String nome, int id) {
        Membro novo = new Membro(nome, id);
        this.membros.add(novo);
        return novo;
    }

    public void show() {
        for (Membro m: membros) {
            System.out.println("Nome: " + m.getNome());
            System.out.println("Id: " + m.getId());
        }
    }
}
