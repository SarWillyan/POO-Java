package BANCO.src;

public class Main {
    public static void main(String[] args) {
        Conta cliente1 = new Conta(1000);
        Conta cliente2 = new Conta(2000);

        System.out.println("Saldo cliente 1: " + cliente1.getSaldo());
        System.out.println("Saldo cliente 2: " + cliente2.getSaldo() + "\n");

        try {
            cliente1.deposita(100);

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            cliente2.deposita(50);

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Saldo cliente 1: " + cliente1.getSaldo());
        System.out.println("Saldo cliente 2: " + cliente2.getSaldo() + "\n");

        try {
            cliente1.saque(500);

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());

        } catch(SaqueException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Saldo atual: " + exception.getSaldo() + "\n");
        }

        try {
            cliente2.saque(2500);

        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());

        } catch(SaqueException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Saldo atual: " + exception.getSaldo() + "\n");
        }

        System.out.println("Saldo cliente 1: " + cliente1.getSaldo());
        System.out.println("Saldo cliente 2: " + cliente2.getSaldo() + "\n");
    }
}
