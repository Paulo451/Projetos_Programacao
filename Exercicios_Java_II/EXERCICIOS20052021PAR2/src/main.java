import java.util.Random;

public class main {
    public static void main(String[] args) {
        Personagem heroi = new Heroi("SuperMan", 100);
        Personagem vilao = new Vilao("RoboCop", 80);
        Random rand = new Random();
        int random;


        while (heroi.getPontosDeVida() > 0 && vilao.getPontosDeVida()> 0)
        {
            random = rand.nextInt(10);
            if(random > 5)
            {
                heroi.atacar();
                vilao.diminuiPontosVida(10);
            }
            if(random > 6)
            {
                vilao.atacar();
                heroi.diminuiPontosVida(10);
            }
            if(heroi.getPontosDeVida() <= 0)
            {
                System.out.println("Viloão ganha");

            }
            if(vilao.getPontosDeVida() <= 0)
            {
                System.out.println("Heroi ganha");

            }
        }
    }
}
