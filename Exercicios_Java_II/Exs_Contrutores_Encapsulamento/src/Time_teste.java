public class Time_teste {
    public static void main(String[] args) {
        Time t1 = new Time(11, 30, 12);
        Time t2 = new Time(12, 0, 0);
        Time t3 = new Time(0, 0, 0);
        Time t4 = new Time(15, 30, 12);

        System.out.println(t4.vizualizarHoraUniversal());
        System.out.println(t4.vizualizarHoraAmPm());
    }
}
