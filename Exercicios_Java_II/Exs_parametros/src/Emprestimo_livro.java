public class Emprestimo_livro {
    private int status;
    private int raAluno;
    private String ISBN;

    public Emprestimo_livro(int status, String ISBN)
    {
        this.status = status;
        this.ISBN = ISBN;
        this.raAluno = 0;
    }

    public int getStatus()
    {
        return status;
    }

    public void setRaAluno(int raAluno)
    {
        this.raAluno = raAluno;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String toString()
    {
        return String.format("\nISBN do livro: %s\nRA do aluno com o livro: %d\nStatus(1-disponivel 2-Ocupado 3-indisponivel): %d\n", this.ISBN, this.raAluno, this.status);
    }
}
