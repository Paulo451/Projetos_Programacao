import java.util.ArrayList;
import java.util.Collections;
public class RespostaAleatoria extends Resposta{

    private String entradaUser;
    private ArrayList<String> respostasAleatorias;

    public RespostaAleatoria(String entradaUser, ArrayList<String> respostasAleatorias) {
        this.respostasAleatorias = respostasAleatorias;
        this.entradaUser = entradaUser;
    }

    @Override
    public boolean verifica(String entrada) {
        return this.entradaUser.equals(entrada);
    }

    @Override
    public String produz() {
        Collections.shuffle(respostasAleatorias);
        return this.respostasAleatorias.get(0);
    }
}
