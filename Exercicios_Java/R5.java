public class R5 {
    private String nome;
    private String sobrenome;
    private double salario;

    public R5(String name, String lastName, double sal)
    {
        if (sal > 0){
            salario = sal;
        }
        nome = name;
        sobrenome = lastName;
    }

    //set e get de nome
    public void setNome(String name){
        nome = name;
    }
    public String getNome(){
        return nome;
    }

    //set e get para sobrenome
    public void setSobrenome(String lastName)
    {
        sobrenome = lastName;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    //set e get de salario
    public void setSalario(double sal)
    {
        salario = sal;
    }
    public double getSalario(){
        return salario;
    }
    //salario anual
    public double salarioAnual(){
        return salario*12;
    }
}
