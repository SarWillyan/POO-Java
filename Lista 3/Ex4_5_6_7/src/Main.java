package Ex4_5_6_7.src;

public class Main {
    public static void main(String[] args)  {

        /*_____________________________________ Exercicio 4 _____________________________________ */
        IntSequence seq0 = IntSequence.of_quest4(7, 2 , 5, 6 ,4 , 8);

        System.out.println("Exercicio 4:");
        System.out.print("[");
        while (seq0.hasNext()) System.out.print(seq0.nextInt() + " ");
        System.out.print("]");
        System.out.println();
        System.out.println("OF_QUEST4() has next? -->" + seq0.hasNext() + "\n");
        /*_______________________________________________________________________________________ */

        /************************************** Exercicio 5 ************************************* */
        IntSequence seq1 = IntSequence.of_quest5(1, 8, 6, 7);

        System.out.println("Exercicio 5:");
        System.out.print("[");
        while (seq1.hasNext()) System.out.print(seq1.nextInt() + " ");
        System.out.print("]");
        System.out.println("\nOF_QUEST5() has next? --> " + seq1.hasNext() + "\n");
        /**************************************************************************************** */

        /*_____________________________________ Exercicio 6 _____________________________________ */
        IntSequence seq2 = IntSequence.constante(5);

        System.out.println("Exercicio 6:");
        int limite = 0;
        System.out.print("[");
        while (seq2.hasNext() && ++limite < 20) System.out.print(seq2.nextInt() + " ");
        System.out.print("]");
        System.out.println();
        System.out.println("Constate() has next? -->" + seq2.hasNext() + "\n");
        /*_______________________________________________________________________________________ */

        /************************************** Exercicio 7 ************************************* */
        System.out.println("Exercicio 7:");
        IntSequence2 test = (int x) -> {
            class bacon implements IntSequence2 {
                @Override 
                public int next() {return x;}
                @Override
                public boolean hasNext() { return true;}
                @Override 
                public IntSequence2 constante(int x) {
                    return null;
                }
            };
            return new bacon();
        };
        test.constante(5);
        int limite2 = 0;
        System.out.print("[");
        while (++limite2 < 20) System.out.print(test.constante(5).next() + " ");
        System.out.print("]");
        System.out.println();
        /**************************************************************************************** */

    }
    /************************************** Exercicio 7 ************************************* */
    interface IntSequence2 {
        default int next() {return 0;}
        default boolean hasNext() {return true;}
        abstract IntSequence2 constante(int x);
    }
    /*
    public static int sequencia(int a, IntSequence2 condicao) {
        return condicao.constante(a);
    }*/
    /**************************************************************************************** */
}
