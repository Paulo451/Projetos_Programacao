public class Primo {
    private int num;

    public Primo(int n)
    {
        this.num = n;
    }
    public String isEven()
    {
        for(int i = num-1; i > 1; i--)
        {
            if(num % i == 0)
            {
                return "Não é Primo";
            }
        }
        return "É Primo";
    }
}
