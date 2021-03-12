public class Cal_Hipo_Test {
    public static void main(String[] args) {
        Cal_Hipo um = new Cal_Hipo(3, 4);
        Cal_Hipo dois = new Cal_Hipo(5, 12);
        Cal_Hipo tres = new Cal_Hipo(8, 15);

        System.out.println(um.hypotenuse());
        System.out.println(dois.hypotenuse());
        System.out.println(tres.hypotenuse());
    }
}
