import java.util.ArrayList;

public class MainJack {
    public static void main(String[] args) {
        ArrayList<JogadorBlackJack> jogadores = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            jogadores.add(new JogadorBlackJack());
        }

        for (int i = 0; i < jogadores.size(); i++) {
            jogadores.get(i).comprarCarta();
        }

        System.out.println((JogadorBlackJack.maisProximo == 0)? "Todos perderam" : JogadorBlackJack.maisProximo);
    }
}
