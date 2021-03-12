import java.util.Scanner;
public class salario_test {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int flag = 0;
        for(int i = 0; flag == 0; i++)
        {
            System.out.printf("Digite o nome do %d funcionario:\n", i+1);
            String nome = entrada.next();
            System.out.printf("Digite as horas trabalhadas do %d funcionario:\n", i+1);
            int horas = entrada.nextInt();
            System.out.printf("Digite o valor das horas do %d funcionario:\n", i+1);
            int salHora = entrada.nextInt();

            salario funcionario = new salario(nome, horas, salHora);

            funcionario.calcularSalario();

            System.out.println("\nDigite 1 para sair e 0 para continuar");
            flag = entrada.nextInt();
        }
    }
}
