public class Pilha_char {
    private char dados[];
    private int top;

    public Pilha_char(int max)
    {
        this.dados = new char[max];
        this.top = 0;
    }

    //size
    public int size()
    {
        return this.top;
    }
    //push
    public void push(char elem)
    {
        if(this.top < this.dados.length)
        {
            this.dados[top] = elem;
            this.top++;
        }else
            {
                System.out.println("Pilha cheia");
            }
    }

    //pop
    public char pop()
    {
        if(this.top > 0)
        {
            this.top--;
            return this.dados[this.top];
        }else
            {
                System.out.println("Pilha vazia");
                return '*';
            }
    }

    //isEmpty
    public boolean isEmpty()
    {
        return this.top == 0;
    }

    //isFull
    public boolean isFull()
    {
        return this.top == this.dados.length;
    }

    //top

    public char top()
    {
        return this.top > 0 ? this.dados[this.top-1] : '*';
    }

    //reset
    public void reset()
    {
        this.top = 0;
    }

}
