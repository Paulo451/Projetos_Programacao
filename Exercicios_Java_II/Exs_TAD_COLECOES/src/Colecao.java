
// Classe estática colçõao de inteiros
// Inserção no próximo espaço vago
// Busca por um valor inteiro dado
// Deletar um valor inteiro dado

public class Colecao {
    private int dados[]; //Armazenamento dos inteiros
    private int numElementos; // Quantos inteiros estão em dados

    //Construtor
    public Colecao(int limiteMax)
    {
        this.dados = new int[limiteMax];
        this.numElementos = 0;
    }

    //Inserir
    public void inserir(int elem)
    {
        if(this.dados.length > this.numElementos) {
            this.dados[this.numElementos] = elem;
            this.numElementos++;
        }
    }

    //Imprimir
    public String toString()
    {
        String res = "";

        for(int i = 0; i < this.numElementos; i++)
        {
            res = res + this.dados[i] + ", ";
        }
        return res;
    }

    //Busca
    public boolean busca(int elem)
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

    //Deletar
    public boolean deletar(int elem)
    {
        int i; //posição do vetor em que elemento está
        for(i=0; i<this.numElementos; i++)
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
        this.numElementos--;

        return true;
    }

    //reset
    public void reset()
    {
        this.numElementos = 0;
    }
}
