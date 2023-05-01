package ARQUIVO.src;

import java.io.BufferedReader;

/**
 * Toda exceção tem que ser tratada em algum momento
 * ela não pode ficar sem tratamento
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> texto = new ArrayList<>(List.of("Prog 3", "Java", "Exception", "Checked Exception"));
        gravaArquivo("registro.txt", texto);
        String linha = lePrimeiraLinha("registro.txt");
        System.out.println(linha);
    }

    public static void gravaArquivo(String path, ArrayList<String> texto){
        PrintWriter out = null;

        try {
            out = new PrintWriter(path);
            for (String linha: texto) {
                out.println(linha);
            }
        } catch(FileNotFoundException ex) {
            System.out.println("Erro ao gravar o arquivo.\n");
        } finally {
            out.close();
        }
    }

    public static String lePrimeiraLinha(String path) {
        ///FileReader fr = null;
        //BufferedReader br = null;

        /**
         * Quando um objeto que precisa ser fechado for aberto por parametro pelo try
         * ele não precisar ser fechado, pois ele é fechado altomaticamente.
         * Caso ele fosse criado dentro do try, precisaria ser fechado, ou seja, preci_
         * saria do finally que está logo abaixo
         */
        
        try (FileReader fr = new FileReader(path);BufferedReader br = new BufferedReader(fr)) {
            //fr = new FileReader(path);
            //br = new BufferedReader(fr);
            return br.readLine();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
            return null;
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return null;
        } /*finally {
            
            try {
                br.close();
                fr.close(); 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}
