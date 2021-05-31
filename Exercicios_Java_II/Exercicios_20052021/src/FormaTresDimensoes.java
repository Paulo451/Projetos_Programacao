public abstract class FormaTresDimensoes extends FormaGeometrica{
    protected double medida1;

    public FormaTresDimensoes(double medida1) {
        this.medida1 = medida1;
    }

    public abstract double calcularVolume();
}
