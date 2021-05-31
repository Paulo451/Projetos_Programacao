import java.util.Scanner;
public class metodos2 {
    public static void main(String[] args)
    {
        int resultado = primeiraSoma();
        segundaSoma(resultado);
    }

    static int primeiraSoma()
    {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.println("Digite 3 numeros: ");

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        int resultado = (n1+n2) / n3;
        System . out . println (" ---------------------") ;
        System . out . println (" Resultado :") ;
        System . out . println ( resultado ) ;
        System . out . println (" ---------------------") ;

        return resultado;
    }
    static void segundaSoma(int result)
    {
        Scanner entrada = new Scanner(System.in);
        int n4;
        System.out.println("Digite um 4 numero: ");
        n4 = entrada.nextInt();
        int resultado = result + n4;
        System . out . println (" ---------------------") ;
        System . out . println (" Resultado :") ;
        System . out . println ( resultado ) ;
        System . out . println (" ---------------------") ;
    }
}
