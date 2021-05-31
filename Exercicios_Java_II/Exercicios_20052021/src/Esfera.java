public class Esfera extends FormaTresDimensoes{
    private double perimetro;

    public Esfera(double medida1, double perimetro) {
        super(medida1);
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Esfera: " + calcularVolume();
    }

    @Override
    public double calcularVolume() {
        return 4*perimetro*medida1*medida1*medida1/3;
    }
}

//4*medida1*medida2*medida2*medida2/3