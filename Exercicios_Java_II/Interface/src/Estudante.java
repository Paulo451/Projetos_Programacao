public abstract class Estudante implements Funcionario{
    protected String curso;
    protected String nome;
    protected int horasEstudoSemana;

    public Estudante(String curso, String nome, int horasEstudoSemana) {
        this.curso = curso;
        this.nome = nome;
        this.horasEstudoSemana = horasEstudoSemana;
    }
}
