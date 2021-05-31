public class Aluno {
    private String nome;
    private int RA;

    public Aluno(String nome, int RA)
    {
        this.nome = nome;
        this.RA = RA;
    }

    public String toString()
    {
        return String.format("Nome: %s\nRA: %d", this.nome, this.RA);
    }
}
