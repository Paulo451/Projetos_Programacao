import java.util.MissingResourceException;

public class Stack {
    private char dados[];
    private int top;

    //Construtort
    public Stack(int max)
    {
        this.dados = new char[max];
        this.top = 0;
    }

    //tamanho
    public int size()
    {
        return this.top;
    }

    //inserir
    public void push(char elem)
    {
        if(this.dados.length > this.top) {
            this.dados[this.top] = elem;
            this.top++;
        }
    }

    //remover
    public char pop()
    {
        if(this.top > 0) {
            this.top--;
            return this.dados[this.top];
        }
        return '$';
    }

    //está vazia?
    public boolean isEmpty()
    {
        return this.top == 0;
    }

    //está cheio
    public boolean isFull()
    {
        return this.top == this.dados.length;
    }
}
