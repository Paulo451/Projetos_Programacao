
public class HearRates_Test {
    public static void main(String[] args)
    {
        HeartRates p1 = new HeartRates("Paulo", "Szuparits", 4, 5, 2001, 2, 3, 2021);
        System.out.printf("%d\n", p1.calcularIdade());
        System.out.printf("%d\n", p1.fmax());
        System.out.printf("%s\n", p1.falvo());
    }
}
