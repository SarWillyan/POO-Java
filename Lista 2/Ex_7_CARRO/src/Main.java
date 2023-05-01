package Ex_7_CARRO.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ultilitarios ultiu = new Ultilitarios();
        Scanner scan = new Scanner(System.in);
        Carro carr = new Carro();
        int op, verifica = 0;

        do {
            ultiu.clearScreen();
            ultiu.menu();
            op = scan.nextInt();
            scan.nextLine();
            
            switch (op) {
                case 1:
                    if (verifica == 0){
                        verifica++;
                        ultiu.clearScreen();
                        System.out.println("Informe:");
                        System.out.print("Tamanho do tanque de combustivel: ");
                        int tam = scan.nextInt();
                        System.out.print("Km/L: ");
                        int kml = scan.nextInt();
                        scan.nextLine();
                        carr = new Carro(tam, kml);
                    }
                    else {
                        System.out.println("Já foi criado um carro!");
                    }
                    System.out.println();
                    System.out.println("Aperte qualquer tecla para continuar.");
                    scan.nextLine();
                    break;
                case 2:
                    ultiu.clearScreen();
                    carr.informacoes();
                    System.out.println();
                    System.out.println("Aperte qualquer tecla para continuar.");
                    scan.nextLine();
                    break;
                case 3:
                    ultiu.clearScreen();
                    System.out.print("Quantidade em litros: ");
                    int l = scan.nextInt();
                    scan.nextLine();
                    if (l + carr.getGasolina() <= carr.getTamanhoTanque()) {
                        carr.abastece(l);
                        System.out.println("Foram abastecidos " + l + "L.");
                    }
                    else {
                        System.out.println("A quantidade escolhida excede a capacidade do tanque.");
                    }
                    System.out.println();
                    System.out.println("Aperte qualquer tecla para continuar.");
                    scan.nextLine();
                    break;
                case 4:
                    ultiu.clearScreen();
                    System.out.print("Km: ");
                    int k = scan.nextInt();
                    scan.nextLine();
                    carr.mover(k);
                    System.out.println();
                    System.out.println("Aperte qualquer tecla para continuar.");
                    scan.nextLine();
                    break;
                default:
                    break;
            }
        } while (op != 0);
        
        scan.close();
    }

}
