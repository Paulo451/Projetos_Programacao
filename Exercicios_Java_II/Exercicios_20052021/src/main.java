public class main {
    public static void main(String[] args) {
        Canhao c1 = new Canhao();

        c1.disparar(10, 10);
        System.out.println("Primeiro -> " + c1.getAlcanceMaximo());

        c1.disparar(20, 5);
        System.out.println("segundo -> " + c1.getAlcanceMaximo());

        c1.disparar(80, 2);
        System.out.println("terceiro -> " + c1.getAlcanceMaximo());

    }
}
