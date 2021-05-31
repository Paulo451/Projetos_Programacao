public class Gato extends Pet{
    private String corPelo;

    public Gato(String nome, String corPelo) {
        super(nome);
        this.corPelo = corPelo;
    }

    @Override
    public String mostrarCarcateristicas() {
        return "Meu nome é " + super.nome + " Sou um gato e meu pelo é " + corPelo;
    }
}
