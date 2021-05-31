public class pilha_test {
    public static void main(String[] args) {
        pilha s = new pilha(10);

        s.push(777);
        s.push(9);
        s.push(54);
        s.push(1);
        s.push(12);

        while(!s.isFull())
        {
            s.push(999);
        }

        System.out.println(s.top());

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }

        System.out.println(s.top());
    }
}
