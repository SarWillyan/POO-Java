import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[3];

        int i = -1, maior = 0;

        while (++i < 3)
        {
            vet[i] = scan.nextInt();
            if (maior < vet[i]) maior = vet[i];
        }
    
        System.out.println("O maior elemento é o " + maior);
        scan.close();
    }
}
