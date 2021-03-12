public class Criptografia {
    private int num;
    private final int[] lista2;
    private final int[] lista3;
    public Criptografia(int numero)
    {
        num = numero;
        lista2 = new int[4];
        lista3 = new int[4];
    }
    public void criptografar()
    {
        int result = 1;
        int num_ret = num;
        int[] lista = new int[4];


        for(int i = 0; result > 0; i++)
        {
            num_ret = num%10;
            int passos = (num_ret + 7) % 10;
            result = num/10;
            num = result;
            lista[i] = passos;
        }
        lista2[1] = lista[0];
        lista2[0] = lista[1];
        lista2[2] = lista[2];
        lista2[3] = lista[3];

        for(int i = 0; i < 4; i++)
        {
            System.out.print(lista2[i]);
        }
        System.out.println("");
    }

    public void descriptografar()
    {
        lista3[2] = lista2[0];
        lista3[3] = lista2[1];
        lista3[1] = lista2[2];
        lista3[0] = lista2[3];

        for(int i = 0; i < 4; i++)
        {
            if(lista3[i] <= 6)
            {
                lista3[i] = lista3[i] + 10;
            }
            lista3[i] = lista3[i] - 7;
        }


        for(int i = 0; i < 4; i++)
        {
            System.out.print(lista3[i]);
        }
    }

}
