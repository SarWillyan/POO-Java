package TASK.src;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Runnable tarefa1 = () -> {
            while (true)
                System.out.println("Tarefa1");
        };

        Runnable tarefa2 = () -> {
            while (true)
                System.out.println("Tarefa2");
        };

        // Responsável por serparar threads para a execulção de tarefas
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(tarefa1); // Execulta tarefa1
        exec.submit(tarefa2); // Execulta tarefa2

        while (true) { // Este while ficará competindo com a execulção de tarefa1 e 2
            System.out.println("main");
        }
    }
}
