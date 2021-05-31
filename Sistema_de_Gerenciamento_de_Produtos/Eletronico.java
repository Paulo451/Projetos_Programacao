public class Eletronico extends Produto{
    protected String voltagem;
    protected int potencia;
    protected String eficiencia;

    public Eletronico(int codigo, String nome, String fabricante, double valorUnit, String voltagem, int potencia, String eficiencia) {
        super(codigo, nome, fabricante, valorUnit);
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + String.format("Voltagem: %s\nPotencia: %d\nEficiencia nivel: %s",
                voltagem, potencia, eficiencia);
    }
}
