import java.util.Random;
public class Rand {
    public static void main(String[] args) {
        Random randomNumbers = new Random(); //gerador de número aleatório
        int face; //armazena cada inteiro aleatório gerado

        //faz o loop 20 vezes
        for (int i = 1; i <=20; i++)
        {
            //numero aleatorio ente 1 e 6
            face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            if(i % 5 == 0)
            {
                System.out.println();
            }
        }
    }
}
