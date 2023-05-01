package INTERFACE.ESTATISTICA.src;
import java.util.Random;

public class SequenciaRandomica implements SequenciaInt{

    private Random gerador;

    // Construtor 
    public SequenciaRandomica() {
        gerador = new Random();
    }

    @Override
    public boolean hasNext() { 
        return true;
    }

    @Override
    public int next() {
        return gerador.nextInt(1000000);
    }
    
}
