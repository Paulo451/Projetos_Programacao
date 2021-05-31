import java.util.ArrayList;
public class ex_1 {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();

        tarefas.add("Comer");
        tarefas.add("estudar");
        tarefas.add("cantar");

        for(int i = 0; i < tarefas.size(); i++)
        {
            System.out.println(tarefas.get(i));
        }
    }
}
