public class mainBiblioteca {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Livro l1 = new Livro("O triste olhar de um pobre ceguinho", "123123123");
        Livro l2 = new Livro("O livro dos mortos", "56755676");
        Livro l3 = new Livro("Karma", "2345235");
        Livro l4 = new Livro("Eita ellee", "63467568");

        b1.adicionarLivros(l1);
        b1.adicionarLivros(l2);
        b1.adicionarLivros(l3);
        b1.adicionarLivros(l4);

        b1.imprimirLivros();
    }
}
