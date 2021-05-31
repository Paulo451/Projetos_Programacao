public class filaDinamica {

    private NoDinamica incio;  //quem é o proximo a ser chamado
    private NoDinamica fim;  // aonde quem chega, entra
    private int total; //quantidades de inteiros na fila

    //Construtor
    public filaDinamica()
    {
        this.incio = null;
        this.fim = null;
        this.total = 0;
    }

    //Está vazia
    public boolean vazia()
    {
        return (this.total == 0);
    }

    //inserir
    public void entra(int elem)
    {
        NoDinamica novo = new NoDinamica(elem);

        if(this.vazia())
        {
            this.incio = novo;
            this.fim = novo;
        }else{
            this.fim.prox = novo;
            this.fim = novo;
        }

        this.total++;
    }

    //remover
    public int sai()
    {
        if(this.vazia())
        {
            System.out.println("Fila vazia!");
            return -1;
        }

        NoDinamica temp = this.incio;

        if(this.total == 1)
        {
            this.incio = null;
            this.fim = null;
        }else{
            this.incio = this.incio.prox;
        }

        this.total--;

        return temp.dado;
    }

    //tamanho
    public int tamanho()
    {
        return this.total;
    }

}
