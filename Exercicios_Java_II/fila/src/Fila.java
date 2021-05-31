public class Fila {

    //TAD FILA ESTÁTICXA DE INTEIROS

    private int dados[];
    private int inicio; //O proóximo a ser retirado
    private int fim; // O local da próxima incerção
    private int total; // o número de elementos

    //Construtor

    public Fila(int tamanho)
    {
        dados = new int[tamanho];
        this.inicio = 0;
        this.fim = 0;
        this.total = 0;
    }

    //está vazia

    public boolean vazia()
    {
//        if(this.total == 0)
//        {
//            return true;
//        }else{
//            return false;
//        }
        return (this.total == 0);
    }

    //está cheia
    public boolean cheia()
    {
        return(this.total == this.dados.length);
    }

    //inserir

    public void entra(int elem)
    {
        if(this.cheia())
        {
            System.out.println("Fila cheia!");
        }else
            {
                this.dados[this.fim] = elem;
                this.fim++;
                if(this.fim == this.dados.length)
                {
                    this.fim = 0;
                }
                this.total ++;
            }
    }

    //Remover

    public int sai()
    {
        if(this.vazia())
        {
            System.out.println("Fila vazia!");
            return -1;
        }else {
              int res = this.dados[inicio];

              this.inicio++;
              if(this.inicio == this.dados.length)
              {
                  this.inicio = 0;
              }
              this.total--;

              return res;
            }
    }

    //tamanho
    public int tamanho()
    {
        return this.total;
    }

    //resetar
    public void reset()
    {
//        while(!this.vazia())
//        {
//            this.vazia();
//        }

        total = 0;
        inicio = 0;
        fim = 0;
    }
}
