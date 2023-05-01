package Ex3.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sieve {
    public static ArrayList<Integer> sieveAL(int n) {   
        /**
         * Cria um array booleano "prime[0...n]" e inicializa
         * ele todo com true. Por fim, as posições de prime 
         * com false não são números primos, com true são 
         * primos, e a contagem começa a partir do 2.
         */
        boolean prime[] = new boolean[n+1];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++) { 
            // Se prime[p] não for alterado, então ele é um primo
            if(prime[p] == true) {
                // Atualiza todos os multiplos de p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        // Imprime todos os números primos
        for(int i = 2; i <= n; i++) {
            if(prime[i] == true)
                result.add(i);
        }
        return result;
    }

    public static Set<Integer> sieveHash(int n) {
        Set<Integer> result = new HashSet<Integer>();
        // Preeche de 2 a n
        for (int i = 2; i <= n; i++)
            result.add(i);

        // remova s2, s · (s + 1), s · (s + 2)
        for (int i = 2; i <= n; i++) {
            if (result.contains(i*i) )
                result.remove(i*i);
        }
        for (int i = 2; i <= n; i++) {
            for (int k = 0, j = i*(i+k); k <= n; j = i*(i+k++)) {
                if( result.contains(j) ) {
                    result.remove(j);
                }
            }
        }

        return result;
    }
}
