import java.util.ArrayList;

public class MainAluno {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));
        alunos.add(new Aluno("Paulo"));

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }



    }
}
