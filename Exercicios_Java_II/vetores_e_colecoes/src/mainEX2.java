public class mainEX2 {
    public static void main(String[] args) {
        CarrinhoDeCompras c1 = new CarrinhoDeCompras();

        Item i1 = new Item("PS4", 2000);
        Item i2 = new Item("XBOX", 1900);
        Item i3 = new Item("JS", 1100);

        c1.adicionarProduto(i1);
        c1.adicionarProduto(i2);
        c1.adicionarProduto(i3);

        System.out.println("Valor do carrinho: " + c1.totalCarrinho());

        c1.mostrarCarrinho();
    }
}
