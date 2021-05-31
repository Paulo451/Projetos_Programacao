public class Colecao_char_teste {
    public static void main(String[] args) {
        Colecao_char c1 = new Colecao_char(4);

        c1.inserir('a');
        c1.inserir('b');
        c1.inserir('c');
        c1.inserir('d');

        System.out.println("Impressão inserir: " + c1);

        System.out.println("Busca: " + c1.busca('b'));

        c1.deletar('b');

        System.out.println("Impressão deletar: " + c1);

        c1.reset();

        c1.inserir('e');
        c1.inserir('f');

        System.out.println("Impressão reset: " + c1);
    }
}
