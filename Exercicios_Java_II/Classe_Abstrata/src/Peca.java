public abstract class Peca {
    protected String nome;
    protected int posicaoX;
    protected int posicaoY;

    public Peca(String nome, int posicaoX, int posicaoY) {
        this.nome = nome;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public void mover(int x,int y)
    {
        this.posicaoX = x;
        this.posicaoY = y;
    }

    public abstract void getInformacao();

}
