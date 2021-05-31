public class RespostaContador extends Resposta{
    private String entradaUser;
    private int cont;

    public RespostaContador(String entradaUser) {
        this.cont = 0;
        this.entradaUser = entradaUser;
    }

    @Override
    public boolean verifica(String entrada) {
        return this.entradaUser.equals(entrada);
    }

    @Override
    public String produz(){
        this.cont += 1;
        return "OK! A conta está atualmente em" + this.cont;
    }
}
