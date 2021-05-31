import java.util.ArrayList;
public class Departamento {
    private ArrayList<Funcionario> funcionarios;

    public Departamento()
    {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f)
    {
        funcionarios.add(f);
    }

    public void aumento(float perc)
    {
        for(int i = 0; i < funcionarios.size(); i++)
        {
            funcionarios.get(i).aumentarSalario(perc);
        }
    }

    public void mostrarEquipe()
    {
        for(int i = 0; i < funcionarios.size(); i++)
        {
            System.out.println(funcionarios.get(i));
        }
    }
}
