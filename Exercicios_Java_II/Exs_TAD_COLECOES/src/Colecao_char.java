public class Colecao_char {
    private char dados[];
    private int numElementos;

    public Colecao_char(int max)
    {
        this.dados = new char[max];
        this.numElementos = 0;
    }

    //inserir dados
    public void inserir(char elem)
    {
        if(this.dados.length > this.numElementos){
            this.dados[numElementos] = elem;
            this.numElementos++;
        }
    }

    //imprimir
    public String toString()
    {
        String res = "";
        for(int i = 0; i < this.numElementos; i++)
        {
           res = res + this.dados[i] + "   ";
        }
        return res;
    }

    //busca
    public boolean busca(char elem)
    {
        for(int i = 0; i < this.numElementos; i++)
        {
            if(this.dados[i] == elem)
            {
                return true;
            }
        }
        return false;
    }

    //deletar

    public boolean deletar(char elem)
    {
        int i = 0;
        for(i = 0; i  < this.numElementos; i++)
        {
            if(this.dados[i] == elem)
            {
                break;
            }
        }
        if(this.numElementos == i)
        {
            return false;
        }

        for(int k = i; k < this.numElementos-1; k++)
        {
            this.dados[k] = this.dados[k+1];
        }
        this.numElementos --;

        return true;
    }

    public void reset()
    {
        this.numElementos = 0;
    }
}
