package Ex5.src;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("Ex5.txt");
        
        System.out.println("Letra A: " + ABC.letraA(path));
        System.out.println("Letra B: " + ABC.letraB(path));
        System.out.println("Letra C: " + ABC.letraC(path));
    }
}
