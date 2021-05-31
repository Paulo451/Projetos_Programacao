public class Teste_pilha_dinamica {
    public static void main(String[] args) {
        Stack_dinamica s = new Stack_dinamica();

        s.push(85);
        s.push(55);
        s.push(123);

        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
}
