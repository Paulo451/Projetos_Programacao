public class Estatistica {
    private int n1;
    private int n2;
    private int n3;

    public Estatistica(int n1, int n2, int n3)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double media()
    {
        return (n1 + n2 + n3)/3.0;
    }

    public int diferenca(int num1, int num2)
    {
        if(num1 - num2 > 0)
        {
            return num1 - num2;
        }else{
            return (num1 - num2) * -1;
        }
    }
}
