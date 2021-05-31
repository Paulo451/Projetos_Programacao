import java.util.ArrayList;
public class main_contatos {
    public static void main(String[] args) {
        ArrayList<contatos> contatos = new ArrayList<>();
        contatos p1 = new contatos("Paulo", "11987602831", "PAULOSZUPARITS@HOTMAIL.COM");
        contatos p2 = new contatos("DSAGSDG", "4566456", "PAULOSZUPTYIARITS@HOTMAIL.COM");
        contatos p3 = new contatos("DFHJD", "11945645687602831", "YTITYI@HOTMAIL.COM");
        contatos p4 = new contatos("PaDFHDFHulo", "646", "TYITYITYI@HOTMAIL.COM");

        contatos.add(p1);
        contatos.add(p2);
        contatos.add(p3);
        contatos.add(p4);

        for(int i = 0; i < contatos.size(); i++)
        {
            System.out.println(contatos.get(i));
        }

    }
}
