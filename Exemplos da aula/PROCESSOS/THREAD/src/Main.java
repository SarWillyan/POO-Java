package THREAD.src;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker tarefa1 = new Worker(1, 100);
        Worker tarefa2 = new Worker(101, 200);
        Worker tarefa3 = new Worker(201, 300);
        Worker tarefa4 = new Worker(301, 400);
        Worker tarefa5 = new Worker(401,500);

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);
        Thread t3 = new Thread(tarefa3);
        Thread t4 = new Thread(tarefa4);
        Thread t5 = new Thread(tarefa5);

        // Inicializa as tarefas
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Faz com que cada tarefa epera a outra ser execultada
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        // Armazena o resultado nas variáveis
        int resp1 = tarefa1.getSomaParcial();
        int resp2 = tarefa2.getSomaParcial();
        int resp3 = tarefa3.getSomaParcial();
        int resp4 = tarefa4.getSomaParcial();
        int resp5 = tarefa5.getSomaParcial();

        System.out.println("Resp1: " + resp1);
        System.out.println("Resp2: " + resp2);
        System.out.println("Resp3: " + resp3);
        System.out.println("Resp4: " + resp4);
        System.out.println("Resp5: " + resp5);
    }
}
