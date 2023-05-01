package OPERACAO.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeito inteiro: ");
        int n1 = scan.nextInt();
        System.out.println();
        System.out.print("Entre com o segundo inteiro: ");
        int n2 = scan.nextInt();
        System.out.println();

        System.out.println("Entre com a operação: SOMA, SUBTRAI, MULTIPLICA, DIVIDE");
        String texto = scan.next();

        Operacao op = Operacao.valueOf(texto);

        int resultado = 0;
        /* 
        switch (op) {
            case SOMA:
                resultado = op.avalia(n1, n2);
                break;
            
            case SUBTRAI:
                resultado = op.avalia(n1, n2);
                break;
            
            case MULTIPLICA:
                resultado = op.avalia(n1, n2);
                break;
            
            case DIVIDE:
                resultado = op.avalia(n1, n2);
                break;
        
            default:
                break;
        }*/

        resultado = op.avalia(n1, n2);

        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
