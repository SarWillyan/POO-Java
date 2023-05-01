package Ex4_5_6_7.src;

public interface IntSequence {

    boolean hasNext();
    int nextInt();

    static IntSequence of_quest4(int... values) { // Exercicio 4
        class SequenceOfDigits implements IntSequence {
            int aux = 0;
            @Override
            public boolean hasNext() { 
                return values.length > aux;
            }

            @Override
            public int nextInt() {
                return values[aux++];
            }
        }
        return new SequenceOfDigits();
    }
    
    static IntSequence of_quest5(int... values) { //Exercicio 5
        return new IntSequence() {
            int aux = 0; 
            /*
            A variável aux vai servir para percorrer values e verificar se exite próximo,
            pois toda vez que nextInt() for chamado ele será incrementado em 1, então quando
            hasNext() for chamado, ele irá verificar se o tamanho de values é maior que aux, 
            se sim, existe um prócimo valor.
            */

            @Override
            public boolean hasNext() { 
                return values.length > aux;
            }

            @Override
            public int nextInt() {
                return values[aux++];
            }
        };
    }

    static IntSequence constante(int n) { // Exercicio 6
        return new IntSequence() {
            /*
            hasNext() retorna sempre verdadeiro, pois é uma sequencia infinita do parametro recebido
            nexInt() retorna sempre o parametro recebido pelo mesmo motivo de hasNext()
            */
            @Override
            public boolean hasNext() {return true; }

            @Override
            public int nextInt() {return n;}
            
        };
    }

    default IntSequence volta(int x){
        return null;
    }
}
