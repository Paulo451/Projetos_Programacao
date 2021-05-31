import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro>livros;

    public Biblioteca()
    {
        livros = new ArrayList<>();
    }

    public void adicionarLivros(Livro livro2)
    {
        livros.add(livro2);
    }

    public void imprimirLivros()
    {
        int i;
        for(i = 0; i < this.livros.size(); i++)
        {
            System.out.println(livros.get(i));
        }
    }
}
