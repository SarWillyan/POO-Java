package CASTING.src;

public class Main {
    public static void main(String[] args) {
        // qualquer referencia de X pode apontar para qualquer classe que ele esteja
        // implementado nela
        X ref1 = new A();
        X ref2 = new B();

        // testando a chamada de métodos da interface
        ref1.imprime();
        ref2.imprime();

        //verifica onde ref1 e ref2 estão sendo instanciados 
        if (ref1 instanceof A) {
            System.out.println("ref1 está instanciado na classe A");
        }

        if (ref2 instanceof A) {
            System.out.println("ref2 está instanciado na classe A");
        }
        else {
            System.out.println("ref2 não está instanciado na classe A");
        }
        /**
        não dá certo
        ref1.f1();
        ref2.f2();
        */

        // Podem ser chamados métodos que estão implementados tanto em X quanto em A e B
        // caso contrario, tem-se que ser feita uma conversão (casting)

        ((A)ref1).f1(); // casting (conversão)
        ((B)ref2).f2(); // casting (conversão)

        A refa = (A) ref1; // casting
        B refb = (B) ref2; // casting

        refa.f1();
        refb.f2();
    }
}
