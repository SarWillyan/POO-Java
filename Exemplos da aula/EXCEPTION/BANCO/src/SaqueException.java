package BANCO.src;

public class SaqueException extends RuntimeException{
    private float saldo;

    public SaqueException(String msg, float saldo){
        super(msg);
        this.saldo = saldo;
    }

    public float getSaldo() {return this.saldo;}
}
