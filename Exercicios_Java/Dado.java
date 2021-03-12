import java.util.Random;
public class Dado {
    public static void main(String[] args) {
        Random rand = new Random();

        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        int f5 = 0;
        int f6 = 0;

        int face;

        for(int i = 0; i < 6000; i++)
        {
            face = 1 + rand.nextInt(6);
            switch (face)
            {
                case 1:
                    ++f1;
                    break;
                case 2:
                    ++f2;
                    break;
                case 3:
                    ++f3;
                    break;
                case 4:
                    ++f4;
                    break;
                case 5:
                    ++f5;
                    break;
                case 6:
                    ++f6;
                    break;
            }
        }
        System.out.println("Face\tFrequencia"); // \t = tab
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", f1, f2, f3, f4, f5, f6);
    }
}
