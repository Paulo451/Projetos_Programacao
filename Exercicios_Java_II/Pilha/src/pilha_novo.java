public class pilha_novo {
    private int dados[];
    private int top;

    public pilha_novo(int max)
    {
        this.dados = new int[max];
        this.top = 0;
    }

    // size
    public int size()
    {
        return this.top;
    }

    //inserir
    public void push(int elem)
    {
       if(this.dados.length > this.top)
       {
           this.dados[this.top] = elem;
           this.top++;
       }
    }

    //remover
    public int pop()
    {
        if(this.top > 0)
        {
            this.top--;
            return this.dados[this.top];
        }else{
            System.out.println("Pilha vazia");
            return -1;
        }
    }

    //isEmpty
    public boolean isEmpty()
    {
        if(this.top == 0)
        {
            return true;
        }else{
            return false;
        }
    }

    //isFull
    public boolean isFull()
    {
        if(this.top == this.dados.length)
        {
            return true;
        }else {
            return false;
        }
    }

    //top
    public int top()
    {
        if(this.top > 0)
        {
            return this.dados[this.top-1];
        }else{
            return -1;
        }
    }

    //reset
    public void reset()
    {
        this.top = 0;
    }
}
