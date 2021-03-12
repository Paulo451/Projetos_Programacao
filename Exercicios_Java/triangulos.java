public class triangulos {
    private char escolha;
    private int qtd;

    public triangulos(char escolha, int qtd)
    {
        this.escolha = escolha;
        this.qtd = qtd;
    }

    public void escolherTipo()
    {
        switch (escolha)
        {
            case 'a':
                tA();
                break;
            case 'b':
                tB();
                break;
            case 'c':
                tC();
                break;
            case 'd':
                tD();
                break;
        }
    }
    private void tA()
    {
        for(int i = 1; i<=qtd; i++)
        {
            for(int l = 0; l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    private void tB()
    {
        for(int i = qtd; i>0; i--)
        {
            for(int l = 0; l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    private void tC()
    {
        for(int i = qtd; i>0; i--)
        {
            for(int l = qtd; l>i;l--)
            {
                System.out.print(" ");
            }

            for(int l = 0; l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    private void tD()
    {
        for(int i = qtd; i>0; i--)
        {
            for(int l = 0; l<i;l++)
            {
                System.out.print(" ");
            }

            for(int l = qtd+1; l>i;l--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
