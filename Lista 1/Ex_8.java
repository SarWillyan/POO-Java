import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex_8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();  //garda elementos de 0 á 60
        int[] loteria_rasultado = new int[6]; //garda 6 elementos aleatórios de 0 á 60
        Random aleatorio = new Random(); //usado para gerar números aleatórios
        int contador = 1;

        while ( contador <= 60) list.add(contador++);
        contador = -1; //zera o contador para ser ultilizado novamente
        
        while (++contador < 6) {
            int indice = aleatorio.nextInt(list.size());
            loteria_rasultado[contador] = list.get(indice);
            list.remove(indice);
        }

        Arrays.sort(loteria_rasultado);

        System.out.print("Resultado da loteria: ");
        System.out.println(Arrays.toString(loteria_rasultado));

        System.out.printf("ArrayList sobrou %d elementos.\n", list.size());;
    }
}
