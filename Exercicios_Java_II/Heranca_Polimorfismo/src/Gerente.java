public class Gerente extends Funcionario{
    private int nFuncionarios;

    public Gerente(String nome, float salario, int nFuncionarios)
    {
        super(nome, salario);
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public void aumentarSalario(float perc)
    {
        super.aumentarSalario(20 + perc);
    }

    @Override
    public String toString()
    {
        return "..";
    }
}
