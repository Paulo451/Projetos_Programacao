import java.util.Scanner;

public class Programa_6 {
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner( System.in );

        int n1;
        int n2;

        System.out.println("Digite o primeiro numero");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        n2 = entrada.nextInt();

        if (n1 == n2 ){
            System.out.printf("%d = %d\n", n1, n2);
        }
        if (n1 != n2 ){
            System.out.printf("%d != %d\n", n1, n2);
        }
        if (n1 > n2 ){
            System.out.printf("%d > %d\n", n1, n2);
        }
        if (n1 < n2 ){
            System.out.printf("%d < %d\n", n1, n2);
        }
        if (n1 >= n2 ){
            System.out.printf("%d >= %d\n", n1, n2);
        }
        if (n1 <= n2 ){
            System.out.printf("%d <= %d\n", n1, n2);
        }
    }
}
