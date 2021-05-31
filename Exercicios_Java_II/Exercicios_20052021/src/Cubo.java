public class Cubo extends FormaTresDimensoes{

    public Cubo(double medida1) {
        super(medida1);
    }

    @Override
    public String toString() {
        return "Cubo: " + calcularVolume();
    }

    @Override
    public double calcularVolume() {
        return medida1 * medida1 * medida1;
    }
}
