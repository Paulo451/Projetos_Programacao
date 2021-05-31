import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Figura_Geometrica> f1 = new ArrayList<>();
        Quadrado q1 = new Quadrado("quadrado", 2, 2);
        Circulo c1 = new Circulo("circulo", 3, 1);
        Losango l1 = new Losango("losango", 4, 5);
        Elipse e1 = new Elipse("Elipse", 6, 7);
        Triangulo t1 = new Triangulo("Triangulo", 3, 4);
        f1.add(q1);
        f1.add(c1);
        f1.add(l1);
        f1.add(e1);
        f1.add(t1);

        for(int i = 0; i < f1.size(); i++)
        {
            System.out.println(f1.get(i).getNome());
            System.out.println(f1.get(i).mostrarLados());
            System.out.println(f1.get(i).calcularArea());
        }
    }
}
