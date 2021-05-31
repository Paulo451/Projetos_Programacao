public abstract class Personagem {
    private String nome;
    private int pontosDeVida;
    protected int energia;

    public Personagem(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.energia = 100;
    }

    public abstract void atacar();

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void diminuiPontosVida(int lost)
    {
        this.pontosDeVida -= lost;
    }
}
