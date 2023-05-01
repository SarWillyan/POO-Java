package Ex_13_FILA.src;

public class Fila {
    /*________________________________________________ NO ________________________________________________*/
    private static class No {
        String str;
        No prox;

        public No (String str) {
            this.str = str;
            this.prox = null;
        }
    }
    /*____________________________________ FIM DA CLASSE ANINHADA NO _____________________________________*/

    /*_____________________________________________ ITERATOR _____________________________________________*/
    public class Iterator {
        No aux = node;
        
        public boolean hasNext() { return aux.prox != null; }
        
        public String next(No aux){
            aux = aux.prox;
            return aux.str;
        }
    }
    /*___________________________________ FIM DA INNER CLASS ITERATOR ____________________________________*/

    /*_______________________________________________ FILA _______________________________________________*/
    private No node;
    private int tamanho;

    public Fila() {}

    public void add(String str) {
        if (tamanho == 0) {
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
        if (tamanho > 0) {
            this.node = node.prox;
            this.tamanho--;
        }
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

    public int getTamanho() {return tamanho;}
    /*___________________________________________ FIM DA FILA ____________________________________________*/
}
