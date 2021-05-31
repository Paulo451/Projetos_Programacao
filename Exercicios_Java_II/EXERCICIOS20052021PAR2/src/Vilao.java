public class Vilao extends Personagem{
    public Vilao(String nome, int pontosDeVida) {
        super(nome, pontosDeVida);
    }

    @Override
    public void atacar() {
        if(energia - 15 >= 0) {
            super.energia -= 15;
        }
    }
}
