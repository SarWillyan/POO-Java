package FATURA.src;
public class Main {
    public static void main(String[] args) {
        //para classe private static class Item
        //---------------------------------------------------------------------------------------------------
        /*
        Fatura minhaFatura = new Fatura(); // cria o objeto minhas faturas
        
        //adicionar itens a fatura
        minhaFatura.addItem("Tenís Nike", 1, 400.0f);
        minhaFatura.addItem("Camiseta Lacoste", 1, 300.0f);
        minhaFatura.addItem("Xbox", 1, 3000.0f);

        // mostra suas faturas
        minhaFatura.show();
        //---------------------------------------------------------------------------------------------------
        */

        // Para classe public static class Item
        //---------------------------------------------------------------------------------------------------
        Fatura minhaFatura = new Fatura();
        
        //adicionar itens a fatura
        Fatura.Item item1 = new Fatura.Item("Tenís Nike", 1, 400.0f);
        Fatura.Item item2 = new Fatura.Item("Camiseta Lacoste", 1, 300.0f);
        Fatura.Item item3 = new Fatura.Item("Xbox", 1, 3000.0f);

        // Adiciona suas faturas
        minhaFatura.addItem(item1);
        minhaFatura.addItem(item2);
        minhaFatura.addItem(item3);

        // Mostra suas faturas
        minhaFatura.show();
        //---------------------------------------------------------------------------------------------------
    }
}
