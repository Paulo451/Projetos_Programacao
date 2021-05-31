public class Estagiario extends Estudante implements Funcionario{
    protected int horasTrabalhoSemana;

    public Estagiario(String curso, String nome, int horasEstudoSemana, int horasTrabalhoSemana) {
        super(curso, nome, horasEstudoSemana);
        this.horasTrabalhoSemana = horasTrabalhoSemana;
    }

    public int horasDedicacao()
    {
        return super.horasEstudoSemana + horasTrabalhoSemana;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhoSemana * 10;
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "horasTrabalhoSemana=" + horasTrabalhoSemana +
                ", curso='" + curso + '\'' +
                ", nome='" + nome + '\'' +
                ", horasEstudoSemana=" + horasEstudoSemana + '\'' +
                 ", horas dedicadas=" + horasDedicacao()
                + '}';
    }
}
