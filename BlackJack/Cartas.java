/*
Paulo Szuparits - RA: 21228847
Felipe Loverdos - RA : 21452932
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        Game g1 = new Game(); //instancia do game
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int dificuldade;
        int continuar;
        int k = 0;
        int acumulador;
        int acumuladorPC;

        //menu

        System.out.println("=====BLACK JACK=====\n");
        System.out.println("\tMENU INICIAL");
        System.out.println("| 1-Começar o jogo|");
        System.out.println("| 2-Ver as regras |");
        System.out.println("| 3-Sair do jogo  |");
        System.out.println("Digite o numero correspondente a opção desejada:");
        opcao = entrada.nextInt();

        switch (opcao) {
            case(1):
                //entrada do usuário (dificuldade)
                do {
                    System.out.println("Digite a dificuldade(1 a 7):");
                    dificuldade = entrada.nextInt();
                    if(dificuldade > 7 || dificuldade < 0)
                    {
                        System.out.println("O nivel de dificuldade deve ser de 1 a 7");
                    }
                }while(dificuldade > 7 || dificuldade < 0); //prevenção de erros valor de dificuldade errado
                //numero de cartas
                int numC = dificuldade * 52;

                //instancia da pilha
                Pilha p = new Pilha(numC);  //Pilha cartas
                Pilha s = new Pilha(numC);  //pilha Naipes

                //instancia vetor
                List<Integer> vetor = new ArrayList<>(); //vetor de cartas
                List<Integer> vetorN = new ArrayList<>(); //vetor de naipes

                //adicionando elementos ao vetor
                for (int i = 1; i <= 13; i++) //adicionando cartas
                {
                    vetor.add(i);
                }

                for (int i = 0; i < 4; i++) //adicionando Naipes
                {
                    vetorN.add(i);
                }

                //shuffle + push
                for (int i = 0; i < 5 * dificuldade; i++) {  //adicionando cartas a pilha
                    Collections.shuffle(vetor);
                    for (int carta : vetor) {
                        p.push(carta);
                        s.push(vetorN.get(k));
                    }
                    if (k < 3)
                        k++;
                }

                do {
                    acumuladorPC = 0;
                    System.out.println("SUA VEZ DE JOGAR!");
                    acumulador = g1.jogo(p, s); // chamado jogo player

                    if (acumulador < 21) { //se o player não estourar
                        System.out.println("VEZ DO COMPUTADOR JOGAR!");
                        acumuladorPC = g1.jogoPC(p, s, acumulador); //chamando jogo PC
                        if (acumulador > acumuladorPC || acumuladorPC > 21) //player ganha
                        {
                            System.out.printf("\nVocê venceu\nSua soma = %d\nSoma Computador: %d\n\n", acumulador, acumuladorPC);
                            g1.contPontosPlayer();
                            g1.Placar();
                        } else {
                            if (acumulador == acumuladorPC)  //empate
                            {
                                System.out.printf("\nEmpate\nSua soma = %d\nSoma Computador: %d\n\n", acumulador, acumuladorPC);
                                g1.contPontosPlayer();
                                g1.contPontosPC();
                                g1.Placar();
                            } else {  //player perde
                                System.out.printf("\nVocê Perdeu, Computador Vence\nSua soma = %d\nSoma Computador: %d\n\n", acumulador, acumuladorPC);
                                g1.contPontosPC();
                                g1.Placar();
                            }
                        }
                    } else { //se o acumulador não for menor que 21
                        if (acumulador == 21) {
                            System.out.printf("\nVocê venceu\nSua soma = %d\nSoma Computador: %d\n\n", acumulador, acumuladorPC);
                            g1.contPontosPlayer();
                            g1.Placar();
                        } else { //se player estorou as cartas
                            System.out.printf("\nVocê Perdeu, Computador Vence\nSua soma = %d\nSoma Computador: %d\n\n", acumulador, acumuladorPC);
                            g1.contPontosPC();
                            g1.Placar();
                        }
                    }

                    if(p.isEmpty())
                    {
                        System.out.println("As cartas acabaram");
                        break;
                    }

                    System.out.println("\nDeseja continuar o jogo? Digite 1 para sim e 0 para não"); //deseja continuar sim ou não
                    continuar = entrada.nextInt();

                } while (continuar == 1); //continuar a jogar

                //saida
                if(!p.isEmpty()) { //se a pilha não estiver vazia
                    System.out.println("");
                    g1.imprimirJogo(p, s); //imprimir o resto das cartas
                    break;
                }

            case(2): //imprimir regras
                System.out.println("O objetivo do jogo é fazer 21 pontos ou o mais proximo disso");
                System.out.println("O jogador que fizer mais pontos sem ultrapassar 21 vence");
                System.out.println("A carta Ás pode valer 1 ou 11");
                System.out.println("Valete dama e rei valem 10 pontos");
                System.out.println("As demais cartas valem seus respectivos valores");
                break;
            default: //sair do jogo
                System.out.println("JOGO TERMINADO");
                break;
        }
    }
}
