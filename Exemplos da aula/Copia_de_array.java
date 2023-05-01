import java.util.Arrays;

public class Copia_de_array {
    public static void main(String[] args)
    {
        //exemplo de maneira errada de se fazer uma copia
        int[] primos = {2,3,7,11};
        int[] numeros = primos;

        System.out.println("Arrays antes de modificações: ");
        System.out.println("primos: ");
        for (int x = 0; x < primos.length; x++)
            System.out.print(primos[x] + " ");

        System.out.println("\nnumeros: ");
        for (int x = 0; x < numeros.length; x++)
            System.out.print(numeros[x] + " ");

        //numeros não recebeu uma copia de primos e sim apontou para primos
        //ou seja, se fizermos uma alteração em numeros, tambem será feita
        //uma alteração em primos
        System.out.println("\n\nFoi inserido 20 na posição 2 de numeros.");
        numeros[2] = 20;

        System.out.println("\nArrays depois de modificações: ");
        System.out.println("primos: ");
        for (int x = 0; x < primos.length; x++)
            System.out.print(primos[x] + " ");

        System.out.println("\nnumeros: ");
        for (int x = 0; x < numeros.length; x++)
            System.out.print(numeros[x] + " ");

        System.out.println("\n\nForma correta de se fazer a copia.");

        //agora da forma correta
        int[] primos2 = {2, 3, 5, 7, 11, 42};
        int[] numeros2 = Arrays.copyOf(primos2, primos2.length);

        System.out.println("Arrays antes de modificações: ");
        System.out.println("primos: ");
        for (int x = 0; x < primos2.length; x++)
            System.out.print(primos2[x] + " ");

        System.out.println("\nnumeros: ");
        for (int x = 0; x < numeros2.length; x++)
            System.out.print(numeros2[x] + " ");

        //desta vez somente a variável números será modificada
        System.out.println("\n\nFoi inserido 20 na posição 2 de numeros.");
        numeros2[2] = 20;

        System.out.println("\nArrays depois de modificações: ");
        System.out.println("primos: ");
        for (int x = 0; x < primos2.length; x++)
            System.out.print(primos2[x] + " ");

        System.out.println("\nnumeros: ");
        for (int x = 0; x < numeros2.length; x++)
            System.out.print(numeros2[x] + " ");

    }
}
