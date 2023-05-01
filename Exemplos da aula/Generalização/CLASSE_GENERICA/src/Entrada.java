package CLASSE_GENERICA.src;

//Com "< >" generaliza-se a classe, que vai ser do tipo
//que for declarada pelo desenvolvedor 
public class Entrada <T, V> {
    private T chave;
    private V valor;

    // Construtor 
    public Entrada(T chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    //getters and setters 
    public T getChave() { return chave;}

    public V getValor() { return valor;}
    
    //public void setChave(int chave) { this.chave = chave;}

    //public void setValor(String valor) { this.valor = valor;} 
}
