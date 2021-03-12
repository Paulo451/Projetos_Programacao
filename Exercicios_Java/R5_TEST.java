public class R5_TEST {
    public static void main (String[] args)
    {
        R5 funcionario1 = new R5("Paulo", "Szuparits", 1500.00);
        R5 funcionario2 = new R5("Isabela", "Halker", 2700.00);

        System.out.printf(" O salario anual de %s é: %.2f\n", funcionario1.getNome(), funcionario1.salarioAnual());
        funcionario1.setSalario(funcionario1.getSalario()*1.10);

        System.out.printf(" O salario anual de %s é: %.2f\n", funcionario2.getNome(), funcionario2.salarioAnual());
        funcionario2.setSalario(funcionario2.getSalario()*1.10);

        System.out.printf(" O salario anual de %s é: %.2f\n", funcionario1.getNome(), funcionario1.salarioAnual());
        System.out.printf(" O salario anual de %s é: %.2f\n", funcionario2.getNome(), funcionario2.salarioAnual());

    }
}
