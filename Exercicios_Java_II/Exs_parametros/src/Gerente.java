public class Gerente {
    private String nome;

    public Gerente(String nome)
    {
        this.nome = nome;
    }

    public void atualizar(Funcionario f, String cargo)
    {
        f.setCargo(cargo);
    }
    public void atualizar(Funcionario f, double salario)
    {
        f.setSalario(salario);
    }
}
