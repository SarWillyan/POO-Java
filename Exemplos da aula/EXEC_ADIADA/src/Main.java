import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        TestaExecAdiada.repete(10, () -> System.out.println("Prog 3!"));

        /* 
        Comparator<String> c1 = TestaExecAdiada.geraComparador(1);
        Comparator<String> c2 = TestaExecAdiada.geraComparador(-1);

        int result1 = c1.compare("linder", "abacaxi");

        System.out.println();*/
    }
}
