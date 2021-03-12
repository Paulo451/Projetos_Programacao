import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;

public class R_GUI1 {

    public static void main(String[] args)
    {
        int result;
        String n1 = (JOptionPane.showInputDialog("Digite o primeiro numero\n"));
        String n2 = JOptionPane.showInputDialog("Digite o segundo numero\n");

        result = parseInt(n1, 10) + parseInt(n2, 10);

        String resultado = String.format("O resultado de %s + %s é %d", n1, n2, result);

        JOptionPane.showMessageDialog(null, resultado);

    }
}
