public class Stack_dinamica {
    private No_dinamica topo;

    //construtor

    public Stack_dinamica()
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
    public void push(int elem)
    {
        No_dinamica novo = new No_dinamica(elem);

        No_dinamica antigoTopo = this.topo;

        novo.prox = antigoTopo;
        this.topo = novo;
    }

    //remover

    public int pop()
    {
        if(this.isEmpty())
            return -1;

        No_dinamica temp = this.topo;
        this.topo = this.topo.prox;
        return temp.dado;
    }
}
