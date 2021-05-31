public class teste_biblioteca {
    public static void main(String[] args) {
        Aluno_Biblioteca aluno1 = new Aluno_Biblioteca("Paulo", 21228847);
        Emprestimo_livro livro1 = new Emprestimo_livro(1, "123456");
        Biblioteca biblio = new Biblioteca();

        System.out.println(livro1);

        biblio.emprestarLivro(livro1, aluno1);

        System.out.println(livro1);
    }
}
