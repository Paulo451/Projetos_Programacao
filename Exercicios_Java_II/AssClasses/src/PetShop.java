import java.util.ArrayList;
public class PetShop {

    private ArrayList<Cachorro> listaDogs;

    public PetShop()
    {
        this.listaDogs = new ArrayList<>();
    }
    public void adicionar(Cachorro dog)
    {
        this.listaDogs.add(dog);
    }

    public void listar()
    {
        for(int i = 0; i < this.listaDogs.size(); i++)
        {
            System.out.println(listaDogs.get(i));
        }
    }

    public void pesquisar(String raca)
    {
        for(int i = 0; i < this.listaDogs.size(); i++)
        {
            if(this.listaDogs.get(i).getRaca().equals(raca))
            {
                System.out.println(listaDogs.get(i).getNomeP1());
            }
        }
    }
}
//• Crie uma classe PetShop que possui objetos da classe Cachorro com os
//        seguintes métodos:
//        – adicionar(): recebe um objeto Cachorro e adiciona na lista.
//        – listar(): imprime os dados de todos os cachorros na lista.
//        – pesquisar(): recebe uma String como parâmetro que é a raça do cachorro e imprime o
//        nome de todos os proprietários que tenham animal dessa raça.