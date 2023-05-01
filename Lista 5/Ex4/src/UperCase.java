package Ex4.src;

import java.util.ArrayList;
import java.util.Iterator;

public class UperCase {
    //(a) Com um iterador
    public static ArrayList<String> letraA(ArrayList<String> array){
        Iterator<String> iter = array.iterator();
        var result = new ArrayList<String>();
        while (iter.hasNext()) {
            result.add(iter.next().toUpperCase()) ;
        }
        return result;
    }

    //(b) Com um loop sobre os valores de índice 
    public static ArrayList<String> letraB(ArrayList<String> array){
        var result = new ArrayList<>(array);

        for (int i = 0; i < array.size(); i++)
            result.set(i, result.get(i).toUpperCase());

        return result;
    }

    //(c) Com o método replaceAll.
    public static ArrayList<String> letraC(ArrayList<String> array){
        var result = new ArrayList<>(array);
        result.replaceAll(String::toUpperCase);
        return result;
    }
}
