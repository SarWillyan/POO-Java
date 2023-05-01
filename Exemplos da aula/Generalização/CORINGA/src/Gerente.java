package CORINGA.src;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Float salario, String area) {
        super(nome, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String toString() {
        return "Nome: " + this.getNome() + "\tSalário: " + this.getSalario() + "\tArea: " + this.area;
    }
}
