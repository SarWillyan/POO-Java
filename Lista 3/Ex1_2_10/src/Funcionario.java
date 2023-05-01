package Ex1_2_10.src;
public class Funcionario implements Mensuravel{
    private String nome;
    private float salario;

    public Funcionario() {}
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public double getMedida() {
        return salario;
    }
    
    @Override 
    public String toString() {
        return "Nome :" + this.getNome() + " Salario: " + this.getSalario();
    }    
}
