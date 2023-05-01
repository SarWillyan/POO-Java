package Ex4.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>(List.of("kuririn", "naruto", "chapolin"));

        System.out.println("Letra A: " + UperCase.letraA(nome));
        System.out.println("Letra B: " + UperCase.letraB(nome));
        System.out.println("Letra C: " + UperCase.letraC(nome));
        System.out.println("Original: " + nome);
    }
}
