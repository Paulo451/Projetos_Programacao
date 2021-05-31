public abstract class Conica extends Figura_Geometrica{
    private double distanciaCentro1;
    private double distanciaCentro2;

    public Conica(String nome, double distanciaCentro1, double distanciaCentro2) {
        super(nome);
        this.distanciaCentro1 = distanciaCentro1;
        this.distanciaCentro2 = distanciaCentro2;
    }

    @Override
    public  double calcularArea()
    {
        return distanciaCentro2 * distanciaCentro1 * Math.PI;
    };

    public String mostrarLados()
    {
        return "Não tenho Lados";
    }

}
