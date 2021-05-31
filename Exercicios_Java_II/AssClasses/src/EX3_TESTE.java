public class EX3_TESTE {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Paulo Szuparits", "11987602831");
        Cachorro c1 = new Cachorro("Milk", "Lulu", "Branco", "20/12/2020", p1);

        Proprietario p2 = new Proprietario("Antonio da Silva", "11963464351");
        Cachorro c2 = new Cachorro("Ampitu", "Lulu", "Preto", "20/2/2019", p2);

        Proprietario p3 = new Proprietario("Carlos meyer", "11985435531");
        Cachorro c3 = new Cachorro("Pipoca", "Beagle", "Castanho", "8/02/2005", p3);

        Proprietario p4 = new Proprietario("Aloisio de Paiva", "1198543531");
        Cachorro c4 = new Cachorro("Sico", "Lulu", "azul", "20/12/2020", p4);

        Proprietario p5 = new Proprietario("Roberto do santo", "112352351");
        Cachorro c5 = new Cachorro("LALA", "Lulu", "verde", "8/12/2020", p5);

        PetShop pet = new PetShop();

        pet.adicionar(c1);
        pet.adicionar(c2);
        pet.adicionar(c3);
        pet.adicionar(c4);
        pet.adicionar(c5);

        pet.listar();

        System.out.println("-------------");
        pet.pesquisar("Beagle");
    }
}
