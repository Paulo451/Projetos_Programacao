public class Fila_String {
    //TAD FILA ESTÁTICXA DE INTEIROS

    private String dados[];
    private int inicio; //O proóximo a ser retirado
    private int fim; // O local da próxima incerção
    private int total; // o número de elementos

    //Construtor

    public Fila_String(int tamanho)
    {
        dados = new String[tamanho];
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

    public void entra(String elem)
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

    public String sai()
    {
        if(this.vazia())
        {
            System.out.println("Fila vazia!");
            return "";
        }else {
            String res = this.dados[inicio];

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
