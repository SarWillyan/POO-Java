package Ex5.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(count("words.txt"));

    }

    // Devolve um treeMap contendo a quantidade de vezes que cada palavra se repete
    public static TreeMap<String, Integer> count(String path) {

        try {
            // Scanner recebe o arquivo á ser lido
            Scanner txt = new Scanner(new File(path));
            // Local onde o resultado será guardado é instanciado
            TreeMap<String, Integer> result = new TreeMap<>();
            /*
             * Laço onde será feita a contagem
             * Roda até chegar ao fim do arquivo
            */
            while (txt.hasNext()) {
                String palavra = txt.next(); // recebe palavra por palavra
                if (palavra != "") { 
                    /* Como 'compute' de treeMap funciona:
                     * compute(key, o que fazer com chave)
                     * No caso, se o valor da chave for null
                     * ele será setado para 1, caso não seja 
                     * null, o valor será incrementado em 1.
                     * 
                     * Isso dá certo devido ao fato de que em
                     * um TreeMap as chaves não se repetem
                     * então toda as vezes que for selecionada
                     * uma chave, o seu valor(v) sempre será o 
                     * mesmo para aquela chave.
                     */
                    result.compute(palavra,(k , v) -> v == null ? 1 : v+1);
                }
            }

            txt.close();
            return result;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
