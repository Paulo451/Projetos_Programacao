public class No {
    public double dado;
    public No prox;

    //Construtor
    public No(double elem)
    {
        this.dado = elem;
        this.prox = null;
    }

    //Impressão
    public String toString()
    {
        return "" + this.dado;
    }
}
