public class Pilha_dinamica {
    private No topo;

    //construtor

    public Pilha_dinamica()
    {
        this.topo = null;
    }

    //está vazia
    public boolean isEmpty()
    {
        if(this.topo == null)
        {
            return true;
        }else{
            return false;
        }
    }

    // Inserir
    public void push(double elem)
    {
        No novo = new No(elem);

        No antigoTopo = this.topo;

        novo.prox = antigoTopo;
        this.topo = novo;
    }

    //remover

    public double pop()
    {
        if(this.isEmpty())
            return -1;

        No temp = this.topo;
        this.topo = this.topo.prox;
        return temp.dado;
    }
}
