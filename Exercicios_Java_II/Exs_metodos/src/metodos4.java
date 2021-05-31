public class metodos4 {
    private int numero1;
    private int numero2;

    public metodos4(int n1, int n2)
    {
        numero1 = n1;
        numero2 = n2;
    }
    public String retornMaior()
    {
        if(numero1>numero2)
        {
         return String.format("%d é maior que %d", numero1, numero2);
        }else
            {
                if(numero2>numero1)
                {
                    return String.format("%d é maior que %d", numero2, numero1);
                }else
                    {
                        return String.format("%d e %d são iguais", numero1, numero2);
                    }
            }
    }
}
