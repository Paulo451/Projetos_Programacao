public class classes1_test {
    public static void main(String[] args) {
        classes1 teste = new classes1("Philco", "Branca", 220, 39.90);
        System.out.printf("%s\n%s\n%d\n%.2f\n", teste.getNome(),teste.getCor(),teste.getPotencia(),teste.getPreco());
        System.out.println(teste.interruptor());
        System.out.println(teste.interruptor());
    }
}
