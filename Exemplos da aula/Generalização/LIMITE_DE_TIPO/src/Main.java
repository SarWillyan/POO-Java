package LIMITE_DE_TIPO.src;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        PrintWriter out1 = new PrintWriter("file1.txt");
        PrintWriter out2 = new PrintWriter("file2.txt");
        PrintWriter out3 = new PrintWriter("file3.txt");

        ArrayList<PrintWriter> arr = new ArrayList<>();
        arr.add(out1);
        arr.add(out2);
        arr.add(out3);

        closeAll(arr);

        AutoCloseable a1 = () -> System.out.println("FECHOU");
        AutoCloseable a2 = () -> System.out.println("FECHOU");
        AutoCloseable a3 = () -> System.out.println("FECHOU");

        ArrayList<AutoCloseable> arr2 = new ArrayList<>();
        arr2.add(a1);
        arr2.add(a2);
        arr2.add(a3);

        closeAll(arr2);
    }

    // Para usar esse método, o parametro que ela vai receber tem que implementar a interface 
    // AutoCloseable, ou seja, o método close()
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elem) throws Exception {
        for (T e: elem) {
            e.close();
        }
    }
}
