public class No_dinamica {

    public int dado;
    public No_dinamica prox;

    //Construtor
    public No_dinamica(int elem)
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
