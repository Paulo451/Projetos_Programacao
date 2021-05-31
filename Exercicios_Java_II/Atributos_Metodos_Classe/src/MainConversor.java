import java.util.Scanner;

public class MainConversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual valor gostaria de converter?");
        double valor = entrada.nextDouble();

        System.out.println("Qual o tipo de ocnversão que você deseja?");
        System.out.println("Opções de conversão: ");
        System.out.println(" 1: de metros para milimetros");
        System.out.println(" 2: de metros para centimetros");
        System.out.println(" 3: de metros para decímetros");
        System.out.println(" 4: de milímetros para metros");
        System.out.println(" 5: de centímetros para metros");
        System.out.println(" 6: de decímetros para metros");

        int escolha = entrada.nextInt();

        switch (escolha)
        {
            case 1:
                System.out.println(Conversor.MetrosMilimetros(valor));
                break;
            case 2:
                System.out.println(Conversor.metrosCentimetros(valor));
                break;
            case 3:
                System.out.println(Conversor.metrosDecimetros(valor));
                break;
            case 4:
                System.out.println(Conversor.milimetrosMetros(valor));
                break;
            case 5:
                System.out.println(Conversor.centimetrosMetros(valor));
                break;
            case 6:
                System.out.println(Conversor.decimetrosMetros(valor));
                break;
            default:
                break;
        }
    }
}
