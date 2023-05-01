public class Professor {
    private String nome;
    private int cpf;
    private float salarioBase;

    // Construtor
    public Professor(String nome, int cpf, float salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    // getters and setters

    // get and set nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // get and set cpf
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    // get and set salarioBase
    public float getSalario() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
}
