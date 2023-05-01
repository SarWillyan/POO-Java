package Ex_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class calendario 
{
    public static void main(String[] args)
    {
        //convertendo strind para inteiros 
        int mes = Integer.parseInt(args[0]);
        int ano = Integer.parseInt(args[1]);

        LocalDate dataBase = LocalDate.of(ano, mes, 1);

        //imprime cabeçalho
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        //imprime calendário
        DayOfWeek diaSemana = dataBase.getDayOfWeek();
        if (diaSemana.getValue() != 7) {
            for (int i = 0; i < diaSemana.getValue(); i++) { System.out.print("    "); }
        }
        
        while (dataBase.getMonthValue() == mes)
        {
            System.out.printf("%4d", dataBase.getDayOfMonth());
            if (dataBase.getDayOfWeek().getValue() == 6)
                System.out.println();
            dataBase = dataBase.plusDays(1);
        }
    }    
}