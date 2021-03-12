import java.util.Scanner;

public class R3 {
    public static void main( String[] args)
    {
        // declarando o scanner
        Scanner entrada = new Scanner(System.in);
        // declaração de variavies
        int numero;
        // entrada do usuário
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        // Decisão
        if (numero % 2 == 0){
            System.out.printf("%d é par", numero); //saída se par
        } else{
            System.out.printf("%d é impar", numero); //saída se impar
        }
    }
}
