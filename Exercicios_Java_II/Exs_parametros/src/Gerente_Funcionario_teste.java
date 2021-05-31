public class Gerente_Funcionario_teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Paulo","Sales", 1500.00);
        Gerente teste = new Gerente("Roberto");

        System.out.println(f);

        teste.atualizar(f, "Oficial");

        System.out.println(f);

        teste.atualizar(f, 9000.00);

        System.out.println(f);
    }
}
