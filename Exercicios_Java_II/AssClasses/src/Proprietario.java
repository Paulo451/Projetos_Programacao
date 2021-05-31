public class Proprietario {
    private String nome;
    private String telefone;

    public Proprietario(String nome, String telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome()
    {
        return nome;
    }

    public String toString()
    {
        return String.format("Nome do proprietário: %s\nTelefone:%s", this.nome, this.telefone);
    }
}
