public class ProfessorDE extends Professor {
    private float bonus;

    // Construtor
    public ProfessorDE(String nome, int cpf, float salario, float bonus) {
        super(nome, cpf, salario); // Chama o construtor da classe Pai
        this.bonus = bonus;
    }

    //getters and setters

    // get e set de bonus
    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float getSalario() {
        return super.getSalario() + this.bonus;
    }
}
