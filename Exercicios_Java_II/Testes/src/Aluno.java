public class Aluno extends idade{
    private String msg;

    public Aluno(String lala, int ano)
    {
        this.msg = lala;
        setAno(ano);
    }

    public void imprimeIdade()
    {
        System.out.printf("%s" + getAno(), msg);
    }
}
