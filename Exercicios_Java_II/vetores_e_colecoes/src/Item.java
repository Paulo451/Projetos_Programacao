public class Item {
    private String nome;
    private float preco;

    public Item(String nome, float preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco()
    {
        return preco;
    }

    public String toString()
    {
        return String.format("Produto: %s -> %.2f", this.nome, this.preco);
    }
}
