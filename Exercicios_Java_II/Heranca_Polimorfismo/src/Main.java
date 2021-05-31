public class Main {
    public static void main(String[] args) {
        Departamento roupas = new Departamento();
        Funcionario f1 = new Funcionario("Paulo", 1500);
        Funcionario f2 = new Funcionario("Jorge", 1700);
        Gerente g1 = new Gerente("André", 2700, 2);

        roupas.adicionarFuncionario(f1);
        roupas.adicionarFuncionario(f2);
        roupas.adicionarFuncionario(g1);

        roupas.mostrarEquipe();

        roupas.aumento(10);

        roupas.mostrarEquipe();
    }
}
