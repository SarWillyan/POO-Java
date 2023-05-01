package Ex5.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ABC {
    // Capturando a exceção na cláusula finally
    //====================================================================================
    public static String letraA(Path path) {
        String result = null;
        BufferedReader in = null;

        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            result = in.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        return result;
    }
    //====================================================================================

    // Uma instrução try/catch contendo uma instrução try/finally
    //====================================================================================
    public static String letraB(Path path) {
        String result = null;
        BufferedReader in = null;

        try {
            try {
                // pode lançar IOExeption
                in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
                result = in.readLine();
            } finally {
                if (in != null) {
                    in.close(); // pode lançar IOExeption
                }
            } 
        } catch (IOException e) { // Capitura IOExeption
            System.out.println(e.getMessage());
        }

        return result;
    }
    //====================================================================================

    // Uma instrução try-with-resources com uma cláusula catch
    //====================================================================================
    public static String letraC(Path path) {
        String result = null;

        try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            result = in.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
    //====================================================================================
}
