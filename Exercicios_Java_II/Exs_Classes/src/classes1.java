public class classes1 {
    private String nome;
    private int potencia;
    private double preco;
    private String cor;
    private boolean ligada;

    public classes1(String nome, String cor, int potencia, double preco)
    {
        this.nome = nome;
        this.cor = cor;
        this.potencia = potencia;
        this.preco = preco;
        this.ligada = false;
    }

    //gets
    public String getNome()
    {
        return this.nome;
    }
    public String getCor()
    {
        return this.cor;
    }
    public int getPotencia()
    {
        return this.potencia;
    }
    public double getPreco()
    {
        return this.preco;
    }

    //sets
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }
    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    //interrupotr

    public boolean interruptor()
    {
        this.ligada = !ligada;
        return ligada;
    }
}
