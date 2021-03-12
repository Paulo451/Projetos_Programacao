public class Pi {
    public static void main(String[] args) {
        double pi = 0;
        double acm = 1;
        for(int i = 0; i < 200000; i++)
        {
            pi += (4/acm) - (4/(acm+2));
            acm += 4;
        }
        System.out.println(pi);
    }
}
