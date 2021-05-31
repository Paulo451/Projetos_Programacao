public class Estatistica_test {
    public static void main(String[] args) {
        Estatistica teste = new Estatistica(10, 8, 9);
        System.out.println("media: " + teste.media());
        System.out.println("diferença: " + teste.diferenca(4, 3));

    }
}
