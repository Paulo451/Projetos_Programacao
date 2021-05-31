import java.util.ArrayList;
public class ChatBot {

    private String[] stringCortada;
    private ArrayList<Resposta> respostasAleatorias;

    public ChatBot(){
        respostasAleatorias = new ArrayList<>();
    }

    public void adiciona(Resposta resposta){
        respostasAleatorias.add(resposta);
    }

    public String processar(String pergunta) {
        stringCortada = pergunta.split(" ");
        for(int i = 0; i < respostasAleatorias.size(); i++) {
            for(int l = 0; l < stringCortada.length; l++) {
                if (respostasAleatorias.get(i).verifica(stringCortada[l])) {
                    return respostasAleatorias.get(i).produz();
                }
            }
        }
        return "";
    }
}
