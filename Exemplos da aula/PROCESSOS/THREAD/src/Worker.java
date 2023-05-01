package THREAD.src;
/**
 * A classe Worker foi cirada devido a Runnable poder implementar
 * somente um método.
 */
public class Worker implements Runnable {
    private int somaParcial;
    private int limiteInf;
    private int limiteSup;

    public Worker(int limiteInf, int limiteSup) {
        this.limiteInf = limiteInf;
        this.limiteSup = limiteSup;
    }

    @Override
    public void run() {
        for (int i = limiteInf; i <= limiteSup; i++) {
            this.somaParcial += i;
        }
    }

    public int getSomaParcial() {
        return somaParcial;
    }

    
}
