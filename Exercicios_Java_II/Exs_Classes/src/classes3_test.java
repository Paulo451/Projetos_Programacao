public class classes3_test {
    public static void main(String[] args) {
        classes3 aluno1 = new classes3("Paulo Szuparits", "21228847", 10, 9);
        aluno1.mostrarDados();
        System.out.println("\nnota final: " + aluno1.mediaFinal());
    }
}
