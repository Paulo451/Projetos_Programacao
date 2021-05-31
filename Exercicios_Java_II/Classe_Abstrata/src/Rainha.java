public class Rainha extends Peca{

    public Rainha(String nome, int posicaoX, int posicaoY) {
        super(nome, posicaoX, posicaoY);
    }

    @Override
    public void getInformacao() {
        System.out.printf("Nome: %s\n Posicao ->x: %d y:%d\n Posso me mover em todas as direções quantas casas desejar",
                super.nome, super.posicaoX, super.posicaoY);
    }
}
