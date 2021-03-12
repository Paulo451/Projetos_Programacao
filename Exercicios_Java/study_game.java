import java.util.Random;
import java.util.Scanner;

public class study_game {
    private int n1;
    private int n2;
    private int resultado;
    private int r;
    private int cont = 0;
    private int qtd;
    private int jogo;
    private int dif;
    private char simb;
    public study_game(int dif, int qtd, int jogo)
    {
        this.dif = dif;
        this.qtd = qtd;
        this.jogo = jogo;
    }

    private int rand(int dif)
    {
        Random numRand = new Random();
        switch(dif)
        {
            case 1:
                return 1 + numRand.nextInt(5);
            case 2:
                return 1 + numRand.nextInt(10);
            case 3:
                return 1 + numRand.nextInt(20);
            case 4:
                return 1 + numRand.nextInt(50);
            case 5:
                return 1 + numRand.nextInt(100);
            default:
                return 0;
        }
    }

    private int multiplicacaoGame()
    {
        this.n1 = rand(dif);
        this.n2 = rand(dif);
        this.resultado = this.n1 * this.n2;

       Scanner entrada = new Scanner(System.in);
       System.out.printf("%d vezes %d é igual a ", n1, n2);
       return entrada.nextInt();
    }

    private int divGame()
    {
        this.n1 = rand(dif);
        this.n2 = rand(dif);
        this.resultado = this.n1 / this.n2;

        Scanner entrada = new Scanner(System.in);
        System.out.printf("%d dividido %d é igual a ", n1, n2);
        return entrada.nextInt();
    }

    private int somaGame()
    {
        this.n1 = rand(dif);
        this.n2 = rand(dif);
        this.resultado = this.n1 + this.n2;

        Scanner entrada = new Scanner(System.in);
        System.out.printf("%d mais %d é igual a ", n1, n2);
        return entrada.nextInt();
    }

    private int subGame()
    {
        this.n1 = rand(dif);
        this.n2 = rand(dif);
        this.resultado = this.n1 - this.n2;

        Scanner entrada = new Scanner(System.in);
        System.out.printf("%d menos %d é igual a ", n1, n2);
        return entrada.nextInt();
    }


    public void verificacao()
    {
        switch (jogo)
        {
            case 1:
                simb = '*';
                for(int i = 0; i < qtd; i++) {
                    jogo(multiplicacaoGame() == resultado);
                }
                break;
            case 2:
                simb = '/';
                for(int i = 0; i < qtd; i++) {
                    jogo(divGame() == resultado);
                }
                break;
            case 3:
                simb = '+';
                for(int i = 0; i < qtd; i++) {
                    jogo(somaGame() == resultado);
                }
                break;
            case 4:
                simb = '-';
                for(int i = 0; i < qtd; i++) {
                    jogo(subGame() == resultado);
                }
                break;
            default:
                jogo(false);
        }
    }

    private void jogo(boolean ver)
    {
        Random numRand = new Random();
        if(ver)
        {
            switch (1 + numRand.nextInt(5))
            {
                case 1:
                    System.out.println("Parabéns");
                    break;
                case 2:
                    System.out.println("Exelente");
                    break;
                case 3:
                    System.out.println("Continue assim");
                    break;
                case 4:
                    System.out.println("Perfeito!");
                    break;
                case 5:
                    System.out.println("Sensacional");
                    break;
            }
            cont++;
        }else
            {
                switch (1 + numRand.nextInt(5))
                {
                    case 1:
                        System.out.printf("Você errou, %d %c %d = %d", this.n1,this.simb ,this.n2, this.resultado);
                        break;
                    case 2:
                        System.out.printf("Que pena!, %d %c %d = %d", this.n1, this.simb,this.n2, this.resultado);
                        break;
                    case 3:
                        System.out.printf("Não desista, %d %c %d = %d", this.n1, this.simb,this.n2, this.resultado);
                        break;
                    case 4:
                        System.out.printf("Por pouco, %d %c %d = %d", this.n1, this.simb,this.n2, this.resultado);
                        break;
                    case 5:
                        System.out.printf("Não,vamos pra proxima, %d %c %d = %d", this.n1, this.simb,this.n2, this.resultado);
                        break;
                }

            }
    }
    public void apresentarPontos()
    {
        System.out.printf("\nVocê fez %d pontos", cont);
    }
}
