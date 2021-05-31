public class Quadrado extends FromaDuasDimensoes{

    public Quadrado(double medida1) {
        super(medida1);
    }

    @Override
    public double calcularaArea() {
        return super.medida1*super.medida1;
    }

    @Override
    public String toString() {
        return "Quadrado: " + calcularaArea();
    }
}
