public class Aluno_Biblioteca {
    private String nome;
    private int RA;

    public Aluno_Biblioteca(String nome, int RA)
    {
        this.nome = nome;
        this.RA = RA;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getRA()
    {
        return this.RA;
    }
}
