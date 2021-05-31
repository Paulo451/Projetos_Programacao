public class Cachorro {

    private String nome;
    private String raca;
    private String cor;
    private String nascimento;
    private Proprietario p1;

    public Cachorro(String nome, String raca, String cor, String nascimento, Proprietario p1)
    {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.nascimento = nascimento;
        this.p1 = p1;
    }

    public String getRaca()
    {
        return this.raca;
    }

    public String getNomeP1()
    {
        return this.p1.getNome();
    }

    public String toString()
    {
        return String.format("Nome do cachorro: %s\n" +
                            "raca:%s\n" +
                            "cor:%s\n" +
                            "Nascimento:%s\n" +
                            "Proprietario:\n" + this.p1, this.nome, this.raca, this.cor, this.nascimento);
    }
}



