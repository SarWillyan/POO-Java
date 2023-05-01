public class Ex_4 {
    public static void main(String[] args) {
        //balanço trimestral de uma empresa
        int[] gasto_do_mes = { 15000, 23000, 17000, 17000, 27000, 17500, 19000, 21000, 15000, 21000, 19000, 20500};
        int total = 0, contador = 0;
        float media = 0;

        for (int i = 0; i < gasto_do_mes.length; i++) {
            total += gasto_do_mes[i];
            media += gasto_do_mes[i];
            if (i == 2 || i == 5 || i == 8 || i == 11) {
                media /= 3;
                System.out.println(++contador +" semestre = " + media);
                media = 0;
            }
        }

        System.out.println("Total de gastos do ano: " + total);
    }
}
