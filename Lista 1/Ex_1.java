import java.util.Arrays;

public class Ex_1 {
    public static void recupera_byte(int valor, int[] primeiro_byte) {
        for(int i = 8, j = 0; i > 0; i = i >> 1, j++) //i = 1000 >> 0100 >> 0010 >> 0001
            primeiro_byte[j] = ( (valor & i) > 0 ) ? 1 : 0; // (condição) ? true : false
    }
    public static void main(String[] args) {
        int valor = 235937;
        int[] primeiro_byte = new int[4];
        for (int x = 0, pos = 1; x <= 8; x += 4, pos++) {
            recupera_byte(valor >> x, primeiro_byte);
            System.out.println(pos + "º byte: " + Arrays.toString(primeiro_byte));
        }
    }
}
