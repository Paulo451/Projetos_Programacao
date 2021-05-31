public class Aluno {
    private String nome;
    private String RA;
    private double mediaFinal;

    public Aluno(String nome, String RA)
    {
        this.nome = nome;
        this.RA = RA;
        this.mediaFinal = 0.0;
    }

    public String getRA()
    {
        return this.RA;
    }

    public String toString()
    {
        return String.format("Nome: %s\nRA: %s\nMedia Final: %.2f", this.nome,
                this.RA, this.mediaFinal);
    }

    public void setMediaFinal(double mediaFinal)
    {
        this.mediaFinal = mediaFinal;
    }
}
