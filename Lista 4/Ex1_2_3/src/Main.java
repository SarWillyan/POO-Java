package Ex1_2_3.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Ex3
        try {
            // Ex1
            ArrayList<Double> resultado = readValues("valores.txt");
            System.out.println(resultado.toString());
            // Ex2
            System.out.printf("SOMA: %.4f", sumOfValues("valores.txt"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    // Ex1
    public static ArrayList<Double> readValues(String fileName) throws NumberFormatException, IOException {
        ArrayList<Double> valores = new ArrayList<>();
        FileReader arq = new FileReader(fileName);
        BufferedReader leitor = new BufferedReader(arq);
        String linha;
        while ((linha = leitor.readLine()) != null ) {
            valores.add(Double.parseDouble(linha));
        }
        arq.close();
        leitor.close();
        return valores;
    }
    //Ex2
    public static double sumOfValues(String fileName) throws NumberFormatException, IOException {
        ArrayList<Double> numeros = readValues(fileName);
        double soma = 0;
        for (Double n : numeros) {
            soma += n;
        }
        return soma;
    }
}
