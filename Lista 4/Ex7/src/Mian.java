package Ex7.src;

public class Mian {
    public static void main(String[] args) {
        System.out.println("OBJECT:");
        Pilha_O nomes = new Pilha_O();

        nomes.push("Amenadiel");
        nomes.push("Angelo");
        nomes.push("Gabriel");
        nomes.push("João");

        nomes.show();

        System.out.println("Removido: " + nomes.pop() + "\n");

        nomes.show();

        System.out.println("E[]:");
        Pilha_E<String> nomes2 = new Pilha_E<>();

        nomes2.push("Amenadiel");
        nomes2.push("Angelo");
        nomes2.push("Gabriel");
        nomes2.push("Weslayne");

        nomes2.show();

        System.out.println("Removido: " + nomes2.pop() + "\n");

        nomes2.show();
    }
}
