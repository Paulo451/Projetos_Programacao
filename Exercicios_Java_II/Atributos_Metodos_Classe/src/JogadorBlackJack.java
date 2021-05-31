import java.util.Random;

public class JogadorBlackJack {
    private int mao;
    public static int maisProximo = 0;

    public void comprarCarta()
    {
        Random gerador = new Random();
        while (this.mao < 18)
        {
            this.mao += gerador.nextInt(10) + 1;
        }
        if(maisProximo < this.mao && this.mao <= 21)
        {
            maisProximo = this.mao;
        }
    }
}
