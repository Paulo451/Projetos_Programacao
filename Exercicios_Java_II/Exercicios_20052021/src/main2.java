import java.util.ArrayList;

public class main2 {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        FormaGeometrica circulo = new Circulo(3);
        FormaGeometrica quadrado = new Quadrado(5);
        FormaGeometrica triangulo = new Triangulo(5, 4);
        FormaGeometrica cubo = new Cubo(5);
        FormaGeometrica esfera = new Esfera(8, 12);
        FormaGeometrica tetra = new Tetraedro(8);

        formas.add(circulo);
        formas.add(quadrado);
        formas.add(tetra);
        formas.add(triangulo);
        formas.add(cubo);
        formas.add(esfera);

        for (int i = 0; i < formas.size(); i++) {
            System.out.println(formas.get(i));
        }

    }
}
