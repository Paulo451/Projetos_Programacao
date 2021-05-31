public class Musica {
    private String nome;
    private String autor;
    private int duracao;

    public Musica(String nome, String autor, int duracao)
    {
        this.nome = nome;
        this.autor = autor;
        this.duracao = duracao;
    }

    public String getNome()
    {
        return this.nome;
    }
}

