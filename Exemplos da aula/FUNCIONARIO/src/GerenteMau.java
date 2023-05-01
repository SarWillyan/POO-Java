package FUNCIONARIO.src;

public class GerenteMau {
    public void diminueSalario(Funcionario func, float percentual) {
        func.aumentaSalario(-percentual);
    }
    //Não altera nada
    public void mudaFuncionario(Funcionario func) {
        Funcionario novo = new Funcionario();
        novo.setNome("João Candido");
        novo.setSalario(7000.0f);
        func = novo;
    }
}
