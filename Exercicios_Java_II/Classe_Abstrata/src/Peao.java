public class Peao extends Peca{

    public Peao(String nome, int posicaoX, int posicaoY) {
        super(nome, posicaoX, posicaoY);
    }

    @Override
    public void getInformacao() {
        System.out.printf("Nome: %s\n Posicao ->x: %d y:%d\n Posso me mover para frente apenas uma casa",
                super.nome, super.posicaoX, super.posicaoY);
    }

}
