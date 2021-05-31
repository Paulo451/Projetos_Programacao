import java.util.ArrayList;

public class mainAuto {
    public static void main(String[] args) {
        ArrayList<Automovel> automovels = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            automovels.add(new Automovel());
        }

        for (int i = 0; i < 30; i++) {
            automovels.get(i).venda();
        }

        System.out.println(Automovel.getQuantidadeVendida());
    }
}
