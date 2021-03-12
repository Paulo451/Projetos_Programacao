public class R4 {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public R4 (String num, String desc, int qtd, double valor)
    {
        numero = num;
        descricao = desc;
        if (qtd < 0){
            quantidade = 0;
        } else {
            quantidade = qtd;
        }
        if(valor < 0) {
            preco = 0.0;
        }else{
            preco = valor;
        }
    }
    //set e get de numero
    public void setNumero (String num)
    {
        numero = num;
    }

    public String getNumero()
    {
        return numero;
    }

    //set e get de descrição
    public void setDescricao (String desc)
    {
        descricao = desc;
    }

    public String getDescricao()
    {
        return descricao;
    }

    //set e get de quantidade
    public void setQuantidade( int qtd )
    {
        if(qtd < 0){
            quantidade = 0;
        }else {
            quantidade = qtd;
        }
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    //set e get de preco
    public void setPreco ( double valor)
    {
        if(valor < 0) {
            preco = 0.0;
        }else{
            preco = valor;
        }
    }

    public double getPreco()
    {
        return preco;
    }

    public double getFatura()
    {
        return quantidade * preco;
    }
}
