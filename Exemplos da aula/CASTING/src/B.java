package CASTING.src;

public class B implements X {

    public void f2() {
        System.out.println("Método especifico da classe B.");
    }
    
    @Override
    public void imprime() {
        System.out.println("Implementação em B.");
    }
}
