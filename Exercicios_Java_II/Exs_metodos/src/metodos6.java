public class metodos6 {
    private int num;
    private int acm;

    public metodos6(int n)
    {
        num = n;
    }
    public int calculaSomatorio()
    {
        for(int i=1; i<=num; i++)
        {
          acm +=i;
        }
        return acm;
    }
}
