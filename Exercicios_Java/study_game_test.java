import java.util.Scanner;
public class study_game_test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dif;
        int jogo;

        do {
            System.out.println("Digite a dificuldade do jogo (1-mais facil ======== 5-mais dificil):");
            dif = entrada.nextInt();
            if(dif < 1 || dif > 5 )
            {
                System.out.println("ERRO, Numero deve ser entre 1 e 5!");
            }
        }while(dif < 1 || dif > 5 );

        System.out.println("Digite quantos exercicios você quer: ");
        int qtd = entrada.nextInt();
        do {
            System.out.println("1-Muliplicação\n2-Divisão\n3-Soma\n4-Subtração\nDigite o numero do jogo: ");
            jogo = entrada.nextInt();
            if(jogo < 1 || jogo > 4)
            {
                System.out.println("ERRO, Numero deve estar entre 1 e 4!");
            }
        }while (jogo < 1 || jogo > 4);

        study_game teste = new study_game(dif, qtd, jogo);
        teste.verificacao();
        teste.apresentarPontos();
    }
}
