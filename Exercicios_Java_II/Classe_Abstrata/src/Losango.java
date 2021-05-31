public class Losango extends Quadrilatero{

    public Losango(String nome, double lado1, double lado2) {
        super(nome, lado1, lado2);
    }

    @Override
    public double calcularArea()
    {
        return super.calcularArea()/2;
    }

}
