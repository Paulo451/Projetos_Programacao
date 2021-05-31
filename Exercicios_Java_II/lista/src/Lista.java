public class Lista {

    //TAD Lista estática de int

    private int[] dados;
    private int qtd;

    //construtor
    public Lista(int tamanho)
    {
        this.dados = new int[tamanho];
        this.qtd = 0;
    }

    // está vazia

    public boolean vazia()
    {
        return (this.qtd == 0);
    }

    // está cheia
    public boolean cheia()
    {
        return(this.qtd == this.dados.length);
    }

    //Inserir
    public void inserir(int elem, int pos)
    {
        if(pos <= this.qtd && !this.cheia())
        {
            if(pos < this.qtd)
            {
                for(int i = this.qtd; i > pos; i--)
                {
                    this.dados[i] = this.dados[i-1];
                }
            }
            this.dados[pos] = elem;
            this.qtd++;
        }
        //senão não inserir
    }

    //Remover
    public int remover(int pos)
    {
        if(pos >= this.qtd || this.vazia())
        {
            System.out.println("ERRO!");
            return -1;
        }
        if(pos < this.qtd -1)
        {
            int res = this.dados[pos];
            for(int i = pos; i < this.qtd-1; i++)
            {
                this.dados[i] = this.dados[i+1];
            }
            this.qtd--;
            return res;
        }
        if(pos == this.qtd - 1)
        {
            int res = this.dados[pos];
            this.qtd--;
            return res;

        }

        return 0;
    }

    // tamanho
    public int tamanho()
    {
        return this.qtd;
    }

    //Setar um elemento
    public void set(int elem, int pos)
    {
        if(pos < this.qtd && pos >= 0)
        {
            this.dados[pos] = elem;
        }
    }

    //get um elemento
    public int get(int pos)
    {
        if(pos < this.qtd && pos >= 0)
        {
            return this.dados[pos];
        } else
        {
            System.out.println("Erro");
            return -1;
        }
    }

}
