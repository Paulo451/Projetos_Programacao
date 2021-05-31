public class Biblioteca {
    public void emprestarLivro(Emprestimo_livro livro, Aluno_Biblioteca aluno)
    {
        if(livro.getStatus() == 1) {
            livro.setRaAluno(aluno.getRA());
            livro.setStatus(2);
            System.out.printf("\n Livro emprestado com sucesso ao %s\n", aluno.getNome());
        }else {
            System.out.println("\nLivro não disponivel\n");
        }
    }
}
