import java.util.Scanner;

public class Ex_2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Coloque o número de elementos desejados (n): ");
        int n = scan.nextInt();

        int ant = 0 , atual = 1, fibo = 1, contador = 0;

        System.out.print("Sequência de Fibonacci: ");
        while (contador++ <= n)
        {
            System.out.print(fibo + " ");
            fibo = ant + atual;
            ant = atual;
            atual = fibo;
        }
        System.out.println("\n");

        scan.close();
    }
}