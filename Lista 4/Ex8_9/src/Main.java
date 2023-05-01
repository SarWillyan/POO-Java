package Ex8_9.src;

public class Main {
    public static void main(String[] args) {
        Table<String, Integer> tabela = new Table<>();
        tabela.add("Isabela", 1);
        tabela.add("Larissa", 2);
        tabela.add("Camila", 3);

        System.out.println(tabela.get("Camila"));

        tabela.add("Camila", 5);

        System.out.println(tabela.get("Camila"));

        tabela.remove("Camila");
        
        System.out.println(tabela.get("Camila"));
    }

}
