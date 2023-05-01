
public class Item implements Cloneable{
    private float preco;
    private String descricao;
    private Data d;

    public Item(float preco, String descricao, int dia, int mes, int ano) {
        this.descricao = descricao;
        this.preco = preco;
        this.d = new Data(dia, mes, ano);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Data getData() {return d;}

    public void setData(int dia, int mes, int ano) {
        d.setDia(dia);
        d.setMes(mes);
        d.setAno(ano);
    }

    @Override //Reescritea de toString
    public String toString() {
        return this.getClass() + "[Descrição: " + this.descricao + " Preço: " + this.preco + this.d + "]";
    }

    @Override //o equals compara objetos
    public boolean equals(Object obj) {
        if (this == obj) return true;
    
        if (obj == null) return false;

        if (this.getClass() != obj.getClass()) return false;

        Item aux = (Item)obj;

        return (this.preco == aux.preco) && (this.descricao == aux.descricao);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Item aux = (Item) super.clone();
        aux.d = new Data(this.d.getDia(), this.d.getMes(), this.d.getAno());
        return aux;
    }
}
