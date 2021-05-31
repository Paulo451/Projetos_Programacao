public class Ex_04 {
    public static void main(String[] args) {
        String nome = "Paulo";
        String nome2 = "Joao";
        String nome3 = "Henrique";
        String nome4 = "Max";
        Fila_String f1 = new Fila_String(5);
        Fila_String f2 = new Fila_String(5);
        Biblioteca b1 = new Biblioteca("O triste olhar", true, f1);
        Biblioteca b2 = new Biblioteca("O Brilhante olhar", false, f2);

        b1.alugarLivro(nome);
        b1.alugarLivro(nome2);
        b1.alugarLivro(nome3);
        b1.mudarDisponivel();
        b1.alugarLivro(nome4);
    }
}
