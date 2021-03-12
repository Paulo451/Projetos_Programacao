import javax.swing.JOptionPane;

public class GUI_02 {

    public static void main (String[] args)
    {
        // pede para o usuário inserir seu nome
        String nome = JOptionPane.showInputDialog("Qual seu nome");

        //cria a mensagem
        String mensagem = String.format("Bem vindo, %s, ao programa do Paulinho", nome);

        //exibe a mensagem para cumprimentar o usuario pelo nome
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
