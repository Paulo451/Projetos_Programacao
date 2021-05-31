public class Funcionario{
    protected String nome;
    protected float salario;

    public Funcionario(String nome, float salario)
    {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float perc)
    {
        salario *= 1+(perc/100);
    }

    @Override
    public String toString()
    {
        return String.format("Funcionario:\nNome: %s\nSalario: %.2f", this.nome, this.salario);
    }
}
