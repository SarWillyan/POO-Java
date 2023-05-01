package Ex7.src;

import java.lang.Thread.State;
import java.util.ArrayList;

public class Soma {
    private static long acc;

    public static Long threadsSomas(int n) {

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            threads.add(new Thread(criaRun(i)));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            while(thread.getState() != State.TERMINATED);
        }

        return acc;
    }

    public static Runnable criaRun(int n){
        Runnable run = () -> {
            for (int i = 1; i <= n; i++) {
                acc = acc + i;
            }
        };
        return run;
    }
}
