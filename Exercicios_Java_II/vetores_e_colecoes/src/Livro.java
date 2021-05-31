public class Livro {
    private String nome;
    private String ISBN;

    public Livro(String nome, String ISBN)
    {
        this.nome = nome;
        this.ISBN = ISBN;
    }

    public String toString()
    {
        return String.format("Nome: %s\n ISBN: %s", this.nome, this.ISBN);
    }
}
