public class Circulo extends FromaDuasDimensoes{
    public Circulo(double medida1) {
        super(medida1);
    }

    @Override
    public double calcularaArea() {
        return super.medida1*super.medida1*Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo: " + calcularaArea();
    }
}
