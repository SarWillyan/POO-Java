package Ex_9.src;

public class Main {
    public static void main(String[] args) {
        Roda r1 = new Roda("Redonda");
        Roda r2 = new Roda("Redonda");
        Roda r3 = new Roda("Quadrada");
        Roda r4 = new Roda("Triangular");
        Roda r5 = new Roda("Esférica");

        Runnable[] rodas = {r1, r2, r3, r4, r5};

        Runnable x = vrunVrun(rodas);

        System.out.println(x);
        
    }

    public static Runnable vrunVrun(Runnable[] go) {
        for (Runnable r : go) {
            r.run();
        }
        return null;
    }
}
