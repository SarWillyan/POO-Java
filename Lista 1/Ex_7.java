import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Escreva uma frase: ");
        String frase = scan.nextLine();//lê a frase do usuário

        //o split é usado para definir o que vai separar uma palavra da outra
        // e o "\\s" é equivalente ao espaço e "|" ao "ou"
        ArrayList<String> array_str = new ArrayList<>(List.of( frase.split("\\s|\\n") ));
        
        //for de quantas vezes será ordenado
        for (int i = 0; i < array_str.size() - 1; i++) {
            //for que ordena
            for (int j = i; j < array_str.size() - 1 - i; j++) {
                if (array_str.get(j).length() > array_str.get(j+1).length()) {
                    String aux = array_str.get(j);
                    array_str.set(j, array_str.get(j+1));
                    array_str.set(j+1, aux);
                }
            }
        }

        System.out.println("Resultado final:");
        //transforma o vetor em uma unica string
        System.out.println(array_str.toString());

        scan.close();
    }
}
