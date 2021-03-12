import org.jetbrains.annotations.NotNull;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
public class GUI_04 extends JPanel {

    public Color teste()
    {
        Random rand = new Random();
        int r = 1 + rand.nextInt(255);
        int G = 1 + rand.nextInt(255);
        int b = 1 + rand.nextInt(255);

        Color test = new Color(r,G,b);
        return test;
    }
    @Override
    public void paintComponent ( Graphics g )
    {

        super.paintComponent(g);

        g.setColor(teste());
        g.fillOval(10, 10, 200, 200);

        g.setColor(teste());
        g.fillOval(25, 25, 170, 170);

        g.setColor(teste());
        g.fillOval(45, 45, 130, 130);

        g.setColor(teste());
        g.fillOval(65, 65, 90, 90);

        g.setColor(teste());
        g.fillOval(90, 90, 42, 42);
    }
}