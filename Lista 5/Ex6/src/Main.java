package Ex6.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        taskPesquisa("words.txt", "ouve");
        String directoryName = System.getProperty("user.dir");
        ArrayList<String> arqList = pesquisaArquivos(new File(directoryName));
        tasks(arqList, "ouve");

    }

    /* Produz uma task que lê todas as palavras de um arquivo, 
     * tentando encontrar uma determinada palavra 
     */
    public static void taskPesquisa(String arquivo, String palavra){
        Runnable task1 = () -> {
            if (pesquisar(arquivo, palavra))
                System.out.println("Palavra " + palavra + " existe em " + arquivo);
        };
        ExecutorService exec = Executors.newFixedThreadPool(1);
        exec.submit(task1);
        exec.shutdown();
    }
    public static boolean pesquisar(String arquivo, String palavra){
        try ( Scanner txt = new Scanner( new File(arquivo)) ) {
            while (txt.hasNext()) {
                String aux = txt.next();
                if (palavra.equals(aux)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    // Proucura arquivos no diretório escolhido
    public static ArrayList<String> pesquisaArquivos(File folder) {
        ArrayList<String> arqList = new ArrayList<>();
		for (File file : folder.listFiles()) {
			if (!file.isDirectory()) {
				System.out.println(file.getName());
                arqList.add(file.toString());
			}
		}
        return arqList;
	}

    public static void tasks(ArrayList<String> arqList, String palavra) {
        ArrayList<Thread> threads = new ArrayList<>();
        ArrayList<Runnable> runnables = new ArrayList<>();

        for (String s : arqList) {
            runnables.add( () -> {
                if (pesquisar(s, palavra))
                    System.out.println("Palavra " + palavra + " existe em " + s);
            } );
        }

        for (Runnable run : runnables) {
            threads.add( new Thread(run));
        }

        for (Thread t : threads) {
            t.start();
        }

        while (true){
            for (Thread t : threads) {
                if (t.getState() == State.TERMINATED)
                    System.exit(0);
            }
        }
        
    }
}
