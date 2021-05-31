public class teste_prova {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Paulo", "21228847");
        Prova n1 = new Prova(10.0, aluno);
        Prova n2 = new Prova(8.0, aluno);
        Professor profe = new Professor();

        profe.calcularMediaFinal(aluno, n1, n2);
        System.out.println(aluno);
    }
}
