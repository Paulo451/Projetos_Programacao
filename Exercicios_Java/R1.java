import java.util.Scanner;

public class R1 {
    public static void main( String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.println("Escreva o primeiro numero: ");
        x = entrada.nextInt();

        System.out.println("Escreva o segundo numero: ");
        y = entrada.nextInt();

        System.out.println("Escreva o terceiro numero: ");
        z = entrada.nextInt();

        result = x * y * z;

        System.out.printf(" O resultado de %d * %d * %d igual a:\n%d", x, y, z, result);
    }
}
