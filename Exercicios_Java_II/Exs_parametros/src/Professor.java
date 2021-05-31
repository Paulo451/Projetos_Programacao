public class Professor {
    public void calcularMediaFinal(Aluno aluno, Prova n1, Prova n2)
    {
        aluno.setMediaFinal((n1.getNota()+n2.getNota())/2.0);
    }
}
