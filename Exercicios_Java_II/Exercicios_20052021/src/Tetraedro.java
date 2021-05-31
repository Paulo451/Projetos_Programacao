public class Tetraedro extends FormaTresDimensoes{
    public Tetraedro(double medida1) {
        super(medida1);
    }

    @Override
    public String toString() {
        return "Tetraedro: " + calcularVolume();
    }

    @Override
    public double calcularVolume() {
        return medida1*medida1*Math.sqrt(2)/12;
    }
}
