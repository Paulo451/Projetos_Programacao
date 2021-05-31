public class RespostaSimples extends Resposta {

    private final String resposta;
    private final String entradaUser;

    public RespostaSimples(String entradaUser,String resposta) {
       this.resposta = resposta;
       this.entradaUser = entradaUser;
    }

    @Override
    public boolean verifica(String entrada) {
        return this.entradaUser.equals(entrada);
    }

    @Override
    public String produz() {
        return this.resposta;
    }
}
