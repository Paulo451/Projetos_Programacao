import java.time.LocalDate;

public class Perecivel extends Produto{
    protected LocalDate validade;
    protected boolean refrigerado;

    public Perecivel(int codigo, String nome, String fabricante, double valorUnit, LocalDate validade, boolean refrigerado) {
        super(codigo, nome, fabricante, valorUnit);
        this.validade = validade;
        this.refrigerado = refrigerado;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "Validade: " + validade + "\n" + ((refrigerado) ? "Sim" : "Não");
    }
}
