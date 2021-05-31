public class Automovel {
    private static int cont = 0;

    public void venda()
    {
        cont++;
    }

    public static int getQuantidadeVendida()
    {
        return cont;
    }
}
