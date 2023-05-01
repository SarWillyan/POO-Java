package FUNCIONARIO.src;

public class Main {
    public static void main(String[] args) {
        Funcionario Fred = new Funcionario();
        
        Fred.setNome("Fred da Silva");
        Fred.setSalario(5000.00f);
        
        System.out.println("Nome: " + Fred.getNome());
        System.out.println("Salário: " + Fred.getSalario());
        System.out.println("ID: " + Fred.getId());

        Fred.aumentaSalario(5.00f);
        //Fred = Fred.aumentaSalario2(5.00f);

        System.out.println();
        System.out.println("Nome: " + Fred.getNome());
        System.out.println("Salário: " + Fred.getSalario());
        System.out.println("ID: " + Fred.getId());

        //testa diminuição de salário
        GerenteMau gerente = new GerenteMau();
        gerente.diminueSalario(Fred, 5.00f);

        System.out.println();
        System.out.println("Nome: " + Fred.getNome());
        System.out.println("Salário: " + Fred.getSalario());
        System.out.println("ID: " + Fred.getId());

        //objeto inicializado pelo construtor
        Funcionario f2 = new Funcionario("Maria Eduarda", 8000.0f);

        System.out.println();
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salário: " + f2.getSalario());
        System.out.println("ID: " + f2.getId());
    }
}
