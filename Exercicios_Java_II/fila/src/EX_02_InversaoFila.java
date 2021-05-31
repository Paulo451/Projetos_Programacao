public class EX_02_InversaoFila {
    public static void main(String[] args) {
        Fila f1 = new Fila(10);
        Fila f2 = new Fila(10);
        pilha p1 = new pilha(10);

        f1.entra(1);
        f1.entra(2);
        f1.entra(3);
        f1.entra(4);
        f1.entra(5);
        f1.entra(6);
        f1.entra(7);
        f1.entra(8);
        f1.entra(9);
        f1.entra(10);

        while (!f1.vazia()) {
            p1.push(f1.sai());
        }

        while (!f2.cheia())
        {
            f2.entra(p1.pop());
        }

        while (!f2.vazia())
        {
            System.out.println(f2.sai());
        }

    }
}
