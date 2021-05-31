public class mainPecas {
    public static void main(String[] args) {
        Peca peao = new Peao("peao", 0, 0);

        peao.getInformacao();

        peao.mover(0, 8);

        if(peao.posicaoY == 8)
        {
            peao = new Rainha("rainha", 0,8);
        }

        peao.getInformacao();
    }
}
