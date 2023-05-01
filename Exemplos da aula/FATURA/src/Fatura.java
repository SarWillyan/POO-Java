package FATURA.src;
import java.util.ArrayList;

public class Fatura {
    ArrayList<Item> itens = new ArrayList<>();

    /*
    //---------------------------------------------------------------------------------------------------
    private static class Item { // classe aninhada estatica e privada
        String descricao;
        int quantidade;
        float precoUnitario;

        // metodos
        float precoTotal() { return this.quantidade * this.precoUnitario; }
        // fim da classe
    }
    // metodos 
    //metodo de add item pela private static class
    public void addItem(String descricao, int quantidade, float precoUnitario) {
        Item novo = new Item();
        novo.descricao = descricao;
        novo.quantidade = quantidade;
        novo.precoUnitario = precoUnitario;

        this.itens.add(novo);
    }
    public void show(){
        for (Item x: this.itens) {
            System.out.println();
            System.out.println("Descrição: " + x.descricao);
            System.out.println("Quantidade: " + x.quantidade);
            System.out.println("Preço da unidade: " + x.precoUnitario);
            System.out.println("Preço total: " + x.precoTotal());
        }
    }
    //---------------------------------------------------------------------------------------------------
    */

    //---------------------------------------------------------------------------------------------------
    public static class Item { // classe aninhada static e public
        private String descricao;
        private int quantidade;
        private float precoUnitario;

        //construtor
        public Item(String descricao, int quantidade, float precoUnitario) {
            this.descricao = descricao;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        // getters and setters
        public String getDescricao() {
            return descricao;
        }
        public int getQuantidade() {
            return quantidade;
        }
        public float getPrecoUnitario() {
            return precoUnitario;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public void setPrecoUnitario(float precoUnitario) {
            this.precoUnitario = precoUnitario;
        }
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        float precoTotal() { return this.quantidade * this.precoUnitario; }
    } // fim da classe
    
    //metodo para add item pela public static class
    public void addItem(Item novo) {
        itens.add(novo);
    }

    public void show(){
        for (Item x: this.itens) {
            System.out.println();
            System.out.println("Descrição: " + x.getDescricao());
            System.out.println("Quantidade: " + x.getQuantidade());
            System.out.println("Preço da unidade: " + x.getPrecoUnitario());
            System.out.println("Preço total: " + x.precoTotal());
        }
    }
    //---------------------------------------------------------------------------------------------------
}
