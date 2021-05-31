import java.util.ArrayList;
public class CarrinhoDeCompras {
    private ArrayList<Item> lista;
    private Item logItem;
    private float total;

    public CarrinhoDeCompras()
    {
        lista = new ArrayList<>();
    }

    public void adicionarProduto(Item item)
    {
        this.lista.add(item);
    }

    public float totalCarrinho()
    {
        for(int i = 0; i < this.lista.size(); i++)
        {
             logItem = this.lista.get(i);
             total += logItem.getPreco();
        }

        return total;
    }

    public void mostrarCarrinho()
    {
        for(int i = 0; i < this.lista.size(); i++)
        {
            System.out.println(lista.get(i));
        }
    }
}
