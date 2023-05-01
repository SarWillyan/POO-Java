public class TestaExecAdiada {
    
    public static void repete(int n, Runnable func) {
        for (int i = 0; i < n; i++) 
            func.run();
    }

    /*
    public static Comparator<String> geraComparador (int direcao) {
        return (String s1, String s2)-> direcao * s1.compareTo(s2);
    }*/
}
