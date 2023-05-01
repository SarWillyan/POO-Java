import java.util.ArrayList;
import java.util.List;

public class Ex_5 {
    public static void main(String[] args) {
        ArrayList<Integer> gasto_do_mes = new ArrayList<>(List.of(15000, 23000, 17000, 17000, 27000, 17500, 19000, 21000, 15000, 21000, 19000, 20500));

        int total = 0, contador = 0;
        float media = 0;

        for (int i = 0; i < gasto_do_mes.size(); i++) {
            total += gasto_do_mes.get(i);
            media += gasto_do_mes.get(i);
            if (i == 2 || i == 5 || i == 8 || i == 11) {
                media /= 3;
                System.out.println(++contador +" semestre = " + media);
                media = 0;
            }
        }

        System.out.println("Total de gastos do ano: " + total);
    }
}
