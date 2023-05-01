package CASTING.src;

public class D implements C {

    // Como D chamou C, ele é obrigado a implementar
    // tanto métodos de C quanto métodos de X
    @Override
    public void imprime2() {
        // vem da interface C
        
    }

    @Override
    public void imprime() {
        // vem da interface X
        
    }
    
}
