import java.util.ArrayList;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();
        int idade = 0;

        do {
            System.out.println("Digite uma idade (para sair digite uma idade negativa)");
            idade = entrada.nextInt();

            idades.add(idade);

        }while (idade > 0);

        for(int i = 0; i < idades.size(); i++)
        {
            System.out.println("->" + idades.get(i));
        }
    }
}
