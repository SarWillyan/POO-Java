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
        System.out.println(" Seg Ter Qua Qui Sex Sab Dom");

        //imprime calendário
        DayOfWeek diaSemana = dataBase.getDayOfWeek();
        for (int i = 1; i < diaSemana.getValue(); i++) { System.out.print("    "); }
        
        while (dataBase.getMonthValue() == mes)
        {
            System.out.printf("%4d", dataBase.getDayOfMonth());
            if (dataBase.getDayOfWeek().getValue() == 7)
                System.out.println();
            dataBase = dataBase.plusDays(1);
        }
    }    
}