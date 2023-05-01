package Ex_12_FILA.src;

public class Fila {
    private No node;
    private int tamanho;

    // Construtor
    public Fila() { }

    // Métodos
    public void add(String str) { 
        if (empty()) {
            this.node = new No(str);
            this.tamanho++;
        } else {
            No aux = node;
            while (aux.prox != null) aux = aux.prox;
            aux.prox = new No(str);
            this.tamanho++;
        }
    }

    public void rm() {
        if (empty()) {
            System.out.println("FIFO vazia.");
        } else {
            this.node = node.prox;
            this.tamanho--;
        }
    }

    public boolean empty() {
        if (this.tamanho == 0)
            return true;
        else
            return false;
    }

    public void show() {
        if (node != null) {
            No aux = node;
            while (aux != null) {
                System.out.println(aux.str);
                aux = aux.prox;
            }
        }
    }

    public int getTamanho() { 
        return tamanho; 
    }
}
