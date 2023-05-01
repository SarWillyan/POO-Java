import java.util.Arrays;
import java.util.Scanner;

public class Ex_9 {

    public static boolean perfeito(int[][] matriz, int t) {
        int soma = 0;
        int c = ( (int) Math.pow(t, 3) +t)/2;
        
        System.out.println("\nC = " + c);
        
        //verifica se a soma da diagonal principal é igual á c
        for (int i = 0; i < t; i++)
            soma += matriz[i][i];
        if (soma != c) return false;

        //verifica se a soma da secundária principal é igual á c
        soma = 0; int aux = 0;
        for (int x = t-1; x >= 0; x--) 
            soma += matriz[x][aux++];
        if (soma != c) return false;

        //verifica se a soma de cada linha é igual á c
        for (int i = 0; i < t; i++) {
            soma = 0;
            for (int j = 0; j < t; j++) {
                soma += matriz[i][j];
            }
            if (soma != c) return false;
        }

        //verifica se a soma de cada coluna é igual á c
        for (int j = 0; j < t; j++) {
            soma = 0;
            for (int i = 0; i < t; i++) {
                soma += matriz[i][j];
            }
            if (soma != c) return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz: ");
        int t = scan.nextInt();

        int[][] matriz = new int[t][t];

        System.out.println("Digite separadamente o valor de uma linha por vez.");
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        boolean verifica = perfeito(matriz, t);

        System.out.println();

        if (verifica) System.out.println("A matriz abaixo é um quadrado mágico.");
        else System.out.println("A matriz abaixo não é um quadrado mágico.");

        for (int[] aux: matriz) System.out.println(Arrays.toString(aux));
        
        scan.close();
    }
}