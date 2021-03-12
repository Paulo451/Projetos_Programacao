public class salario {
    private String nome;
    private int horas;
    private double salHoras;

    public salario(String name, int hours, double sHours)
    {
        nome = name;
        horas = hours;
        salHoras = sHours;
    }
    public void calcularSalario()
    {
        if (horas > 40){
            System.out.printf("O funcionario %s irá receber R$%.2f", nome, (40*salHoras) + ((horas-40)*(salHoras*1.5)));
        }else{
           System.out.printf("O funcionario %s irá receber R$%.2f", nome, horas*salHoras);
        }
    }

}
