package RAND_INT.src;

/*
 * Quando uma exceção é lançada, ela tem que ser 
 * tratada em algum lugar, e pode ser passada a 
 * "bola" da exceção para o próximo colocando na 
 * declaração da função "throws ...." expecificando
 * qual o tipo de erro.
 * Caso seja uma  exceção do tipo não checadas elas
 * não precisam ser tratadas, mas se for do tipo de
 * exceção checada, ela deve ser tratada.
*/

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(randInt(10, 100));
        } catch (Exception e) {
            System.out.println("Erro tratado com sucesso");
            System.out.println(e.getMessage());
        }
        
    }

    public static int randInt(int inferior, int superior) {
        if (inferior >= superior) {
            throw new IllegalArgumentException("inferior mair que superior");
        }
        return (int)(inferior + Math.random() * (superior - inferior));
    }
}
