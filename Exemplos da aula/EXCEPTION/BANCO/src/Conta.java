package BANCO.src;

public class Conta {
    private float saldo;

    // Construtor
    public Conta(float saldo) {
        this.saldo = saldo;
    }

    //getters
    public float getSaldo() {return this.saldo;}

    //deposita
    public void deposita(float valor) { 
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que 0. valor passado = " + valor);
        }
    }

    public void saque(float  valor) { 
        if ( valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0. valor passado = " + valor);
        } else {
            if (valor > this.saldo) {
                throw new SaqueException("Valor acimado do saldo" , saldo);
            } else { 
                this.saldo -= valor;
            }
        }
    }
}
