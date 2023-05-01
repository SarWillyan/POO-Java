package INTERFACE.ESTATISTICA.src;

public interface SequenciaInt {
    int next(); // retorna o proximo inteiro da sequencia
    default boolean hasNext() { // true se ha o proximo elemento na sequencia 
        return true;
    }
}
