import java.util.Scanner;  // programa utiliza a classse Scanner

public class Programa_5 {
    public static void main( String[] args )
    {
        //cria um Scanner para obter entrada da janela de comando
        Scanner entrada = new Scanner( System.in);

        int n1;
        int n2;
        int result;

        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextInt();

        result = n1 + n2;

        System.out.printf("O resultado é %d\n", result);
    }
}
