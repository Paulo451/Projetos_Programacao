public class Colecao_Pessoas {
    private Pessoa dados[];
    private int numElementos;

    public Colecao_Pessoas(int limite)
    {
        this.dados = new Pessoa[limite];
        this.numElementos = 0;
    }

    //Inserir
    public void inserir(Pessoa pessoa)
    {
        this.dados[numElementos] = pessoa;
        this.numElementos++;
    }

    //Imprimir
    public String toString()
    {
        String res = "";

        for(int i = 0; i < this.numElementos; i++)
        {
            res = res + this.dados[i] + "\n";
        }

        return res;
    }

    //Busca
    public String busca(String nome)
    {

        for(int i = 0; i < this.numElementos; i++)
        {
            if(this.dados[i].getNome().equals(nome))
            {
                return dados[i].getEndereco();
            }
        }
        return "Endereço não encontrado para este nome";
    }

    //deletar
    public boolean deletar(String nome)
    {
        int i;
        for(i = 0; i < this.numElementos; i++)
        {
            if(this.dados[i].getNome().equals(nome))
            {
                break;
            }
        }
        if(numElementos == i)
        {
            return false;
        }

        for(int k = i; k < numElementos-1; k++)
        {
            this.dados[k] = this.dados[k+1];
        }
        this.numElementos--;

        return true;
    }

    //reset
    public void reset()
    {
        this.numElementos = 0;
    }
}
