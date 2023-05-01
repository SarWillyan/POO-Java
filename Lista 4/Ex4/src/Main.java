package Ex4.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(Paths.get("words.txt"));
            out = new 
            // Writing to a file.
            PrintWriter("output.txt");
            while (in.hasNext()) {
                out.println(in.next().toLowerCase());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } finally {
            in.close();
            if (in.ioException() !=  null)
                System.out.println("in.close() Deu erro");
            out.close();
            if (out.checkError() != true)
                System.out.println("out.checkError Deu erro");
        }
    }
}
