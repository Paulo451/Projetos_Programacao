public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
    }

    //Geters
    public String getNome()
    {
        return this.nome;
    }

    public String getEndereco()
    {
        return this.endereco;
    }

    //Seters
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String toString()
    {
        return String.format("Nome: %s - Endereço: %s", this.nome, this.endereco);
    }
}
