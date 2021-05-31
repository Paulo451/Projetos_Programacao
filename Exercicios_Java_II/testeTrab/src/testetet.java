import java.util.ArrayList;

public class testetet {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();


        pessoas.add(new Pessoa("Paulo", 20));

        pessoas.add(new Pessoa("Olivia", 70));

        System.out.println(pessoas.get(0));
        System.out.println(pessoas.get(1));


    }
}
