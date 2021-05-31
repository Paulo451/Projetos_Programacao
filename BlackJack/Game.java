import java.util.Scanner;

public class Game {
    private int acumulador;
    private int card;
    private int naipe;
    private int pontosPlayer;
    private int pontosPC;

    public Game()
    {
        this.acumulador = 0;
        this.card = 0;
        this.naipe = 0;
        this.pontosPlayer = 0;
        this.pontosPC = 0;
    }

    public int jogo(Pilha p, Pilha s)
    {
        Scanner entrada = new Scanner(System.in);
        this.acumulador = 0;
        int h_s = 2; //Hit or Stand
        int flagAs = 0; //flag para o Ás
        int flagAsHit = 0; //flag Ás para o escopo hit

        do {  // do while para hit, se stand = break.
            if(h_s == 2) { //acumulando valores da carta 1/ SE STAND
                card = p.pop();
                if(card > 10) {  //se o card for maior que 10 ele sera valete dama ou rei que valem 10
                    acumulador += 10;
                }
                else {  //se não pega o valor do card
                    acumulador += card;
                }

                System.out.print("Suas duas cartas iniciais são: ");
                switch (card) {  //impressão da carta 1
                    case (1):
                        System.out.print("Ás");
                        break;
                    case (11):
                        System.out.print("Valete");
                        break;
                    case (12):
                        System.out.print("Dama");
                        break;
                    case (13):
                        System.out.print("Rei");
                        break;
                    default:
                        System.out.print(card);
                        break;
                }

                naipe = s.pop();

                switch (naipe)  //impressão do naipe 1
                {
                    case(0):
                        System.out.print(" de Paus ");
                        break;
                    case(1):
                        System.out.print(" de Ouros ");
                        break;
                    case(2):
                        System.out.print(" de Copas ");
                        break;
                    default:
                        System.out.print(" de Espadas ");
                        break;
                }

                if(card == 1) //Se ás aciona a flag
                {
                    flagAs = 1;
                }

                card = p.pop();

                if(card > 10) { //acumulando valores da carta 2
                    acumulador += 10;
                }
                else {
                    acumulador += card;
                }

                switch (card) {  //impressão carta 2
                    case (1):
                        System.out.print("- Ás");
                        break;
                    case (11):
                        System.out.print("- Valete");
                        break;
                    case (12):
                        System.out.print("- Dama");
                        break;
                    case (13):
                        System.out.print("- Rei");
                        break;
                    default:
                        System.out.print("- " + card);
                        break;
                }

                naipe = s.pop();

                switch (naipe)  //impressão do naipe 2
                {
                    case(0):
                        System.out.print(" de Paus");
                        break;
                    case(1):
                        System.out.print(" de Ouros");
                        break;
                    case(2):
                        System.out.print(" de Copas");
                        break;
                    default:
                        System.out.print(" de Espadas");
                        break;
                }

                if(card == 1) //Se ás aciona a flag
                {
                    flagAs = 1;
                }

                System.out.println();

            }else  //SE HIT
                {
                    card = p.pop();
                    if(card > 10) { //acumulando valores da carta 2
                        acumulador += 10;
                    }
                    else {
                        acumulador += card;
                    }

                    System.out.print("Carta adicional: ");

                    switch (card) {
                        case (1):
                            System.out.print("Ás ");
                            break;
                        case (11):
                            System.out.print("Valete ");
                            break;
                        case (12):
                            System.out.print("Dama ");
                            break;
                        case (13):
                            System.out.print("Rei ");
                            break;
                        default:
                            System.out.print(card + " ");
                            break;
                    }

                    naipe = s.pop();

                    switch (naipe)  //impressão do naipe 1
                    {
                        case(0):
                            System.out.print("de Paus");
                            break;
                        case(1):
                            System.out.print("de Ouros");
                            break;
                        case(2):
                            System.out.print("de Copas");
                            break;
                        default:
                            System.out.print("de Espadas");
                            break;
                    }

                    if (card == 1) //se card for as ativa a flag
                    {
                        flagAsHit = 1;
                    }
                }

            if(acumulador == 11 && flagAs == 1) //se acumulador = 11 irá dar black jack se uma das cartas for o As
            {
                System.out.println("Black Jack, Você venceu");
                acumulador = 21;
                break;
            }
            if(acumulador == 10 && flagAsHit == 1)
            {
                System.out.println("\nBlack Jack, Você venceu");
                acumulador = 21;
                break;
            }
            if(acumulador < 11 && (flagAs == 1 || flagAsHit == 1))  //se o acumulador < 11 o as vale 11
            {
                acumulador -= 1;
                acumulador += 11;
            }

            if(this.acumulador <= 21) {
                System.out.println("\nDigite 1 para Hit e 2 para Stand");
                h_s = entrada.nextInt();
            }else{
                break;
            }


        }while(h_s == 1);

        return this.acumulador;
    }



    public int jogoPC(Pilha p, Pilha s, int acm)
    {
        this.acumulador = 0;
        int h_s = 2; //Hit or Stand
        int flagAs = 0; //flag para o Ás
        int flagAsHit = 0; //flag Ás para o escopo hit

        do {  // do while para hit, se stand = break.
            if(h_s == 2) { //acumulando valores da carta 1/ SE STAND
                card = p.pop();
                if(card > 10) {  //se o card for maior que 10 ele sera valete dama ou rei que valem 10
                    acumulador += 10;
                }
                else {  //se não pega o valor do card
                    acumulador += card;
                }

                System.out.print("As duas cartas iniciais são: ");
                switch (card) {  //impressão da carta 1
                    case (1):
                        System.out.print("Ás");
                        break;
                    case (11):
                        System.out.print("Valete");
                        break;
                    case (12):
                        System.out.print("Dama");
                        break;
                    case (13):
                        System.out.print("Rei");
                        break;
                    default:
                        System.out.print(card);
                        break;
                }

                naipe = s.pop();

                switch (naipe)  //impressão do naipe 1
                {
                    case(0):
                        System.out.print(" de Paus ");
                        break;
                    case(1):
                        System.out.print(" de Ouros ");
                        break;
                    case(2):
                        System.out.print(" de Copas ");
                        break;
                    default:
                        System.out.print(" de Espadas ");
                        break;
                }

                if(card == 1) //Se ás aciona a flag
                {
                    flagAs = 1;
                }

                card = p.pop();

                if(card > 10) { //acumulando valores da carta 2
                    acumulador += 10;
                }
                else {
                    acumulador += card;
                }

                switch (card) {  //impressão carta 2
                    case (1):
                        System.out.print("- Ás");
                        break;
                    case (11):
                        System.out.print("- Valete");
                        break;
                    case (12):
                        System.out.print("- Dama");
                        break;
                    case (13):
                        System.out.print("- Rei");
                        break;
                    default:
                        System.out.print("- " + card);
                        break;
                }

                naipe = s.pop();

                switch (naipe)  //impressão do naipe 2
                {
                    case(0):
                        System.out.print(" de Paus");
                        break;
                    case(1):
                        System.out.print(" de Ouros");
                        break;
                    case(2):
                        System.out.print(" de Copas");
                        break;
                    default:
                        System.out.print(" de Espadas");
                        break;
                }

                if(card == 1) //Se ás aciona a flag
                {
                    flagAs = 1;
                }

                System.out.println();

            }else  //SE HIT
            {
                card = p.pop();
                if(card > 10) { //acumulando valores da carta 2
                    acumulador += 10;
                }
                else {
                    acumulador += card;
                }

                System.out.print("\nCarta adicional: ");

                switch (card) {
                    case (1):
                        System.out.print("Ás ");
                        break;
                    case (11):
                        System.out.print("Valete ");
                        break;
                    case (12):
                        System.out.print("Dama ");
                        break;
                    case (13):
                        System.out.print("Rei ");
                        break;
                    default:
                        System.out.print(card + " ");
                        break;
                }

                naipe = s.pop();

                switch (naipe)  //impressão do naipe 1
                {
                    case(0):
                        System.out.print("de Paus");
                        break;
                    case(1):
                        System.out.print("de Ouros");
                        break;
                    case(2):
                        System.out.print("de Copas");
                        break;
                    default:
                        System.out.print("de Espadas");
                        break;
                }

                if (card == 1) //se card for as ativa a flag
                {
                    flagAsHit = 1;
                }
            }

            if(acumulador == 11 && flagAs == 1) //se acumulador = 11 irá dar black jack se uma das cartas for o As
            {
                System.out.println("\nBlack Jack, ");
                acumulador = 21;
                break;
            }
            if(acumulador == 10 && flagAsHit == 1)
            {
                System.out.println("\nBlack Jack, ");
                acumulador = 21;
                break;
            }
            if(acumulador < 11 && (flagAs == 1 || flagAsHit == 1))  //se o acumulador < 11 o as vale 11
            {
                acumulador -= 1;
                acumulador += 11;
            }

            if(this.acumulador < 21 && acm > this.acumulador) {
                h_s = 1;
            }else{
                break;
            }


        }while(h_s == 1);

        return this.acumulador;
    }

    public void imprimirJogo(Pilha p ,Pilha s)
    {
        System.out.println("===========Mostrando o resto das cartas===========");
        while (!p.isEmpty())
        {
            card = p.pop();
            switch (card)
            {
                case(1):
                    System.out.print("Ás ");
                    break;
                case(11):
                    System.out.print("Valete ");
                    break;
                case(12):
                    System.out.print("Dama ");
                    break;
                case(13):
                    System.out.print("Rei ");
                    break;
                default:
                    System.out.print(card + " ");
                    break;
            }
            naipe = s.pop();

            switch (naipe)
            {
                case(0):
                    System.out.println("de Paus");
                    break;
                case(1):
                    System.out.println("de Ouros");
                    break;
                case(2):
                    System.out.println("de Copas");
                    break;
                default:
                    System.out.println("de Espadas");
                    break;
            }
        }
    }

    public void contPontosPlayer()
    {
        this.pontosPlayer += 1;
    }

    public void contPontosPC()
    {
        this.pontosPC += 1;
    }

    public void Placar()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("| Player    | Computador    |");
        System.out.printf ("| %d         | %d             |\n", this.pontosPlayer, this.pontosPC);
        System.out.println("|           |               |");
        System.out.println("------------------------------");

        System.out.println("Deseja resetar os pontos. Digite 1 para sim e 0 para não.");
        int escolha = entrada.nextInt();

        if(escolha == 1)
        {
            resetPontos();
            System.out.println("------------------------------");
            System.out.println("| Player    | Computador    |");
            System.out.printf ("| %d         | %d            |\n", this.pontosPlayer, this.pontosPC);
            System.out.println("|           |               |");
            System.out.println("------------------------------");
        }
    }

    public void resetPontos()
    {
        this.pontosPC = 0;
        this.pontosPlayer = 0;
        System.out.println("Pontos zerados");
        Placar();
    }
}
