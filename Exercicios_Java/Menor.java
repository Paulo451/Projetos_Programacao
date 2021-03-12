import java.util.Scanner;
public class Menor {
    private int qtd;

    public Menor(int qtd)
    {
        this.qtd = qtd;
    }

    public void encontrandoMenor()
    {
        int menor = 99999999;
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < qtd; i++)
        {
            System.out.println("Digite um Numero:");
            int num = entrada.nextInt();
            if(num < menor)
            {
                menor = num;
            }
        }
        System.out.printf("O menor numero dentre os digitados é: %d", menor);
    }
}
