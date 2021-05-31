public class Ex_01_FilaCrescente {
    public static void main(String[] args) {
        Fila f1 = new Fila(10);

        int log = 0;
        int log2 = 0;

        f1.entra(1);
        f1.entra(2);
        f1.entra(3);
        f1.entra(4);
        f1.entra(5);
        f1.entra(6);
        f1.entra(7);
        f1.entra(8);
        f1.entra(9);
        f1.entra(7);

        log = f1.sai();

        while (!f1.vazia())
        {
            log2 = f1.sai();
            if(log > log2)
            {
                System.out.println("Não é crescente");
                return;
            }

            log = log2;
        }

        System.out.println("é crescente");

    }
}
