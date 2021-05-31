public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString()
    {
        return String.format("%02d/%02d/%02d", this.dia, this.mes, this.ano);
    }
}