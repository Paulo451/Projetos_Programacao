import java.awt.*;
import java.util.Random;

public class Craps {
    private static final Random randNum = new Random();

    private enum Status {CONTINUAR, VENCEU, PERDEU};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public void play()
    {
       int pontos = 0;
       Status gameStatus;

       int sumOfDice = rollDice();

       switch ( sumOfDice )
       {
           case SEVEN:
           case YO_LEVEN:
               gameStatus = Status.VENCEU;
               break;

           case SNAKE_EYES:
           case TREY:
           case BOX_CARS:
               gameStatus = Status.PERDEU;
               break;
           default:
               gameStatus = Status.CONTINUAR;
               pontos = sumOfDice;
               System.out.printf("\nPontos: %d\n", pontos);
               break;
       }

       while (gameStatus == Status.CONTINUAR)
       {
           sumOfDice = rollDice();

           if(sumOfDice == pontos)
           {
               gameStatus = Status.VENCEU;
           }else{
               if(sumOfDice == SEVEN)
               {
                   gameStatus = Status.PERDEU;
               }
           }
       }

       if( gameStatus == Status.VENCEU)
       {
           System.out.println("\nGanhou");
       }else
           {
               System.out.println("\nPerdeu");
           }
    }

    public int rollDice()
    {
        int l1 = 1 + randNum.nextInt(6);
        int l2 = 1 + randNum.nextInt(6);

        int sum = l1 + l2;

        System.out.printf("\nResultado: %d + %d = %d", l1, l2, sum);

        return sum;
    }

}
