import javax.swing.JFrame;

public class GUI_03_TEST {
    public static void main(String[] args) {
        GUI_03 teste = new GUI_03();
        JFrame aplication = new JFrame();

        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplication.add( teste );
        aplication.setSize(230, 250);
        aplication.setVisible(true);

    }
}
