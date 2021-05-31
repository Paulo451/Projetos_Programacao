public abstract class Quadrilatero extends Figura_Geometrica{

    private double lado1;
    private double lado2;

    public Quadrilatero(String nome, double lado1, double lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea()
    {
        return lado1 * lado2;
    };

    public String mostrarLados()
    {
        return "Tenho quatro lados";
    }
}
