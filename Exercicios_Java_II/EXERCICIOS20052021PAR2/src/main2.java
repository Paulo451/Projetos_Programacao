import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class main2 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> cores = new ArrayList<>();

        cores.add("Preto");
        cores.add("Malhado");
        cores.add("Branco");


        nomes.add("Milk");
        nomes.add("Jose");
        nomes.add("Alamo");
        nomes.add("Catch");
        nomes.add("astolfo");
        nomes.add("jorge");
        nomes.add("lok");
        nomes.add("thor");
        nomes.add("mijoinr");
        nomes.add("dura");

        Random gerador = new Random();
        int rand;

        for (int i = 0; i < 10; i++) {
          rand = gerador.nextInt(100);
          Collections.shuffle(nomes);
          Collections.shuffle(cores);

          if(rand <= 40)
          {
              pets.add(new Cachorro(nomes.get(i), gerador.nextInt(15)+1));
          }else {
              pets.add(new Gato(nomes.get(i), cores.get(gerador.nextInt(2))));
          }
        }

        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).mostrarCarcateristicas());
        }
    }
}
