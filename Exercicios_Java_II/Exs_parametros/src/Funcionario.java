public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario)
    {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }
    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public String toString()
    {
        return String.format("Nome: %s\n Salario: %.2f\nCargo: %s\n", this.nome, this.salario, this.cargo);
    }
}
