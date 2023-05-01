package Ex_9.src;

public class Roda implements Runnable {
    private String nome;

    @Override 
    public void run(){
        System.out.println("Nome: " + this.nome);
    }

    public Roda (String nome) {this.nome = nome;}
}
