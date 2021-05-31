public class Heroi extends Personagem{
    public Heroi(String nome, int pontosDeVida) {
        super(nome, pontosDeVida);
    }

    @Override
    public void atacar() {
        if(energia - 20 >= 0) {
            super.energia -= 20;
        }
    }
}
