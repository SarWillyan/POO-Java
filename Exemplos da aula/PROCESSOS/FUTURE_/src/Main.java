package FUTURE_.src;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> tarefa1 = () -> {
            int acc = 0;
            for (int i = 1; i <= 100; i++) {
                acc += i;
            }
            return acc;
        };
        Callable<Integer> tarefa2 = () -> {
            int acc = 0;
            for (int i = 1; i <= 100; i++) {
                acc += i;
            }
            return acc;
        };
        Callable<Integer> tarefa3 = () -> {
            int acc = 0;
            for (int i = 1; i <= 100; i++) {
                acc += i;
            }
            return acc;
        };
        Callable<Integer> tarefa4 = () -> {
            int acc = 0;
            for (int i = 1; i <= 100; i++) {
                acc += i;
            }
            return acc;
        };

        // Cria o serviço execultor 
        ExecutorService exec = Executors.newFixedThreadPool(2);
        // Future precisa de um retorno, por isso foi usado o Callable
        Future<Integer> resp1 = exec.submit(tarefa1);
        Future<Integer> resp2 = exec.submit(tarefa2);
        Future<Integer> resp3 = exec.submit(tarefa3);
        Future<Integer> resp4 = exec.submit(tarefa4);

        int total = resp1.get() + resp2.get() + resp3.get() + resp4.get();

        System.out.println("Total: " + total);

        /**
         * Caso queira criar um ArrayList de Callable (ArrayList<Callable<Integer>>)
         * Terá que ser criada uma List<Future<Integer>> que receba um executo de serviço
         * que tenha como parâmetro de submição o ArrayList de Calleble.
         */
    }
}
