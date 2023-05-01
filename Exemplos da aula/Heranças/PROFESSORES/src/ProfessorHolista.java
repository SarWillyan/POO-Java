public class ProfessorHolista extends Professor {
    private int nHoras;

    // Construtor
    public ProfessorHolista(String nome, int cpf, float horasBase, int nHoras) {
        super(nome, cpf, horasBase); // Construtor da classe Pai
        this.nHoras = nHoras;
    }

    // getters and setters

    public void setNumeroHoras(int nHoras) {
        this.nHoras = nHoras;
    }
    public int getNumeroHoras() {
        return nHoras;
    }

    @Override 
    public float getSalario() {
        return super.getSalario() * this.nHoras;
    }
}
