public class Aluno {
    private static int ra = 1;
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public static int geraRA()
    {
        return ra++;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}' + "RA{" + geraRA() + "}";
    }
}
