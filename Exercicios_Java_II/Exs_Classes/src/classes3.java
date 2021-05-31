public class classes3 {
    private String nome;
    private String RA;
    private double n1;
    private double n2;

    public classes3(String nome, String RA, double n1, double n2)
    {
        this.nome = nome;
        this.RA = RA;
        this.n1 = n1;
        this.n2 = n2;
    }
    //gets
    public String getNome()
    {
        return this.nome;
    }

    public String getRA()
    {
        return this.RA;
    }

    public double getN1()
    {
        return this.n1;
    }

    public double getN2()
    {
        return this.n2;
    }

    //sets

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setRA(String RA)
    {
        this.RA = RA;
    }

    public void setN1(double n1)
    {
        this.n1 = n1;
    }

    public void setN2(double n2)
    {
        this.n2 = n2;
    }

    public void mostrarDados()
    {
        System.out.printf("Nome: %s\nRA: %s\nNota 1: %.2f\nNota 2: %.2f", this.nome, this.RA, this.n1, this.n2);
    }

    public double mediaFinal()
    {
        return (this.n1*0.4) + (this.n2*0.6);
    }
}
