public class contatos {
    private String nome;
    private String telefone;
    private String email;

    public contatos(String nome, String telefone, String email)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String toString()
    {
       return String.format("Nome: %s\nTelefone:%s\nEmail:%s", this.nome, this.telefone, this.email);
    }
}
