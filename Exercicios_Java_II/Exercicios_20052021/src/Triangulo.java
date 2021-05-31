public class Triangulo extends FromaDuasDimensoes{
    private double altura;

    public Triangulo(double medida1, double altura) {
        super(medida1);
        this.altura = altura;
    }

    @Override
    public double calcularaArea() {
        return super.medida1 * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo: " + calcularaArea();
    }
}
