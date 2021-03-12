import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int flag = 0;
        int totalLitros = 0;
        int totalKm = 0;
        for(int i=0; flag==0;i++)
        {
            System.out.println("Digite um valor para distancia");
            int km = entrada.nextInt();
            System.out.println("Digite um valor para consumo");
            int l = entrada.nextInt();

            double result = km / l;

            System.out.printf("KM/L do %d tanque: %.2fkm/l\n", i+1, result);

            totalLitros += l;
            totalKm += km;

            System.out.println("Deseja sair? (digite '1' para sair e '0' para continuar)");
            flag = entrada.nextInt();
        }
        System.out.printf("Kilometros rodados: %d km\nLitros consumidos: %d L", totalKm, totalLitros);
    }
}
