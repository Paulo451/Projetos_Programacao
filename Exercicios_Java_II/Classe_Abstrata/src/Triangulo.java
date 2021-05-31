public class Triangulo extends Figura_Geometrica{
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return base*altura;
    }

    public String mostrarLados()
    {
        return "Tenho três lados";
    }
}
