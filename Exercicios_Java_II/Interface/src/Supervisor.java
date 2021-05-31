public class Supervisor implements Funcionario{
    protected int qtdSupervisionados;
    protected double salarioBase;

    public Supervisor(int qtdSupervisionados, double salarioBase) {
        this.qtdSupervisionados = qtdSupervisionados;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * qtdSupervisionados;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "qtdSupervisionados=" + qtdSupervisionados +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
