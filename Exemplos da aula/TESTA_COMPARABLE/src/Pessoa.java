package TESTA_COMPARABLE.src;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int id;
    
    // Construtor
    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
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

    @Override
    /*como ele funciona: se o chamador vir antes do parametro retorna -1
                         se o chamador vir depois do parametro retorna 1
                         se o chamador e o parametro forem iguais retorna 0  */
    public int compareTo(Pessoa o) { //ordena
        return this.nome.length() - o.nome.length();
    }

    
}
