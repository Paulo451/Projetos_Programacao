public class Movel extends Produto{
    protected String tipoMaterial;

    public Movel(int codigo, String nome, String fabricante, double valorUnit, String tipoMaterial) {
        super(codigo, nome, fabricante, valorUnit);
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + String.format("Tipo do material: %s", tipoMaterial);
    }
}
