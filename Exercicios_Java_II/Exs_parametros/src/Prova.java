public class Prova {
    private double nota;
    private String RA;

    public Prova(double nota, Aluno aluno)
    {
        this.nota = nota;
        this.RA = aluno.getRA();
    }

    public double getNota()
    {
        return this.nota;
    }
}
