public class main_pessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Paulo Szuparits", "R. DR. Silvino Canuto Abreu, 39");
        Pessoa p2 = new Pessoa("Pedro assuncao", "Av. Washington luiz, 2999");
        Pessoa p3 = new Pessoa("Lucas benati", "R. das palmeiras, 12");
        Pessoa p4 = new Pessoa("Larissa carmon", "Av. Behini, 329");
        Pessoa p5 = new Pessoa("Isabela Halker", "R. José Garbuio, 47");

        Colecao_Pessoas c1 = new Colecao_Pessoas(5);

        c1.inserir(p1);
        c1.inserir(p2);
        c1.inserir(p3);
        c1.inserir(p4);
        c1.inserir(p5);



    }
}
