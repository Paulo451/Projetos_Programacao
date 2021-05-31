public class Cachorro extends Pet{
    private double peso;

    public Cachorro(String nome, double peso) {
        super(nome);
        this.peso = peso;
    }

    @Override
    public String mostrarCarcateristicas() {
        return "Meu nome é " + super.nome + " Sou um cachorro e peso " + peso;
    }
}
