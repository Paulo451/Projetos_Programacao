public class Pilha_char_test {
    public static void main(String[] args) {
        Pilha_char teste = new Pilha_char(5);

        teste.push('a');
        teste.push('b');
        teste.push('c');

        System.out.println(teste.pop());
        System.out.println(teste.top());
    }
}
