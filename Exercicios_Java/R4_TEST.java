import static java.lang.Integer.parseInt;

import javax.swing.JOptionPane;
public class R4_TEST {
    public static void main( String[] args)
    {
        R4 produto1 = new R4("0", "null", -1, -1);

        String dados = String.format("Numero do produto: %s\n" +
                "Descrição do produto: %s\n" +
                "Quantidade do produto: %d\n" +
                "Valor do Produto: %.2f\n" +
                "Total: %.2f\n", produto1.getNumero(),
                produto1.getDescricao(), produto1.getQuantidade(),
                produto1.getPreco(), produto1.getFatura());

        JOptionPane.showMessageDialog(null, dados);

        String numero = JOptionPane.showInputDialog("Digite o numero do produto:");
        produto1.setNumero(numero);

        String descricao = JOptionPane.showInputDialog("Digite a descricao do produto:");
        produto1.setDescricao(descricao);

        String quantidade = JOptionPane.showInputDialog("Digite a quantidade do produto:");
        produto1.setQuantidade(parseInt(quantidade, 10));

        String valor = JOptionPane.showInputDialog("Digite o valor do produto:");
        produto1.setPreco(Double.parseDouble(valor));

        String dados2 = String.format("Numero do produto: %s\n" +
                        "Descrição do produto: %s\n" +
                        "Quantidade do produto: %d\n" +
                        "Valor do Produto: %.2f\n" +
                        "Total: %.2f\n", produto1.getNumero(),
                produto1.getDescricao(), produto1.getQuantidade(),
                produto1.getPreco(), produto1.getFatura());

        JOptionPane.showMessageDialog(null, dados2);

    }
}
