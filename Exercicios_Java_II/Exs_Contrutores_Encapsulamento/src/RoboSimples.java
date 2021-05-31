import java.lang.*;
public class RoboSimples {
    private char direcoes;

    public RoboSimples(char dir)
    {
        if(dir == 'N' || dir == 'S' || dir == 'L' || dir == 'O') {
            this.direcoes = dir;
        }else
            {
                System.out.println("Caractere inválido");
            }
    }

}
