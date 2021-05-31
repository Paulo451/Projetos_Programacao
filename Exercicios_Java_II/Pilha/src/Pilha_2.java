public class Pilha_2 {
    private String[] dados;
    private int top;
    private String[] palavra;

    public Pilha_2(String palavra)
    {
        this.dados = palavra.split("");
        this.palavra = new String[dados.length];
    }

    public void pop()
    {
        int i = 0;
        for(this.top = dados.length; top > 0; top--)
        {
            this.palavra[i] = this.dados[this.top-1];
            i++;
        }

        for(String elem : palavra)
        {
            System.out.print(elem + " ");
        }
    }
}
