package FUNCIONARIO.src;
//import java.util.Random;

public class Funcionario {
    private String nome;
    private float salario;
    private String cargo = "Progamador";
    private static int nextId = 0; //vari�vel de classe: � uma vari�vel que pode ser acessada por qualquer objeto instaciado pela classe.
    private int id;


    /*{//bloco de inicialização
        Random gerador = new Random();
        id = gerador.nextInt(1000000000);
    }*/
    {
        id = nextId;
        nextId++;
    }

    //Construtores
    public Funcionario() {
        this.salario = 1212.0f;
        this.nome = " ";
    }

    public Funcionario(String nome, float salario) {
        this.salario = salario;
        this.nome = nome;
    }

    //chama um construtor por outro
    public Funcionario(String nome) {
        this(nome, 1212.0f);//chama o segundo construtor
    }

    //cria um factory para objeto gerente
    public static Funcionario criaGerente(String nome, float salario) {
        Funcionario novo = new Funcionario(nome, salario);
        novo.cargo = "Gerente";
        return novo;
    }

    //getters and setters (mértodos de instâcia)
    public String getNome() {
        return this.nome;
    }
    public float getSalario() {
        return this.salario;
    }
    public int getId() {
        return this.id;
    }
    public String getCargo() {
        return this.cargo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    //aumenta o salario de um funcionário por um percentual
    public void aumentaSalario(float percentual) {
        float aumento = salario * (percentual/100.0f);
        salario += aumento;
    }

    public Funcionario aumentaSalario2(float percentual) {
        float aumento = salario * (percentual/100.0f);
        float salarioNovo = salario + aumento;
        Funcionario novo = new Funcionario();
        novo.setNome(nome);
        novo.setSalario(salarioNovo);
        return novo;
    }
}
