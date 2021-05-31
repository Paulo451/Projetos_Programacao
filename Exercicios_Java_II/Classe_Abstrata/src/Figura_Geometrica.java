public abstract class Figura_Geometrica {
    private String nome;
    public Figura_Geometrica(String nome)
    {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularArea();

    public abstract String mostrarLados();
}
