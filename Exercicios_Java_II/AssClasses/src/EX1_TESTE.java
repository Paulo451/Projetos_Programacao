public class EX1_TESTE {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Paulo Szuparits", "11987602831");
        Cachorro c1 = new Cachorro("Milk", "Lulu", "Branco", "20/12/2020", p1);

        System.out.println(c1);
    }
}
