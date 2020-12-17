#include <stdio.h>
#include <stdlib.h>

int main()
{
    //declaracao de variaveis inicial.
    char e1, e2, e3, e4;

    //declaracao de variaveis mamiferos.
    char eM1, eM2, eM3, eM4;
    char eQ1, eQ2;
    char eB1, eB2;

    //declaracao de variaveis aves
    char eA1,eA2;
    char eNoV1;

    //declaracao de variaveis repteis
    char eR1, eR2;

    //menu
    printf("==========JOGO DOS ANIMAIS===========\n");
    printf("O jogo deve ser respondido apenas com s para sim e n para nao\nVAMOS JOGAR?\n");
    scanf(" %c", &e4);


    if(e4=='s'){




    //entrada 1 pergunta
    printf("Eh um mamifero?\n");
    scanf(" %c", &e1);
    //decis�o mamiferos
    if(e1=='s'){//se for um mamifero
        printf("Eh um quadrupede?(anda nas quatro patas)\n");
        scanf(" %c", &eM1);
    if(eM1=='s'){//se for quadrupede
            printf("Eh carnivoro?\n");
            scanf(" %c", &eQ1);
    if(eQ1=='s'){//se for carnivoro
            printf("O Animal eh um leao\n");

    }else{//se n�o for carnivoro
        printf("O Animal eh um cavalo\n");
    }

    }else{//se n�o for quadrupede
        printf("Eh um bipede?(anda nas 2 patas)\n");
        scanf(" %c", &eM2);
    if(eM2=='s'){//se for bipede
        printf("Eh onivoro?\n");
        scanf(" %c", &eB1);
    if(eB1=='s'){//se for onivoro
            printf("O Animal eh o Homem!\n");

    }else{//se nao for onivoro
        printf("O Animal eh o macaco\n");
    }


    }else{//se nao for bipede
        printf("O animal voa?\n");
        scanf(" %c", &eM3);
    if(eM3=='s'){//se o animal voar
            printf("O Animal eh o morcego\n");

    }else{//se o animal nao voar
        printf("O Animal eh a baleia\n");
    }

    }

    }



    }else{//se n�o for um mamifero
        printf("Eh uma ave?\n");
        scanf(" %c", &e2);

        if(e2=='s'){//se for uma ave
                printf("Ela voa?\n");
                scanf(" %c", &eA1);

                if(eA1=='n'){//se for ave n�o voadora
                        printf("Eh uma ave tropical?\n");
                        scanf(" %c", &eNoV1);


                        if(eNoV1=='s'){//se for ave tropical
                                printf("O animal eh um avestruz\n");

                        }else{//se n�o for ave tropical
                            printf("O animal eh um pinguim\n");
                        }

                }else{//se for ave que voa
                    printf("Eh uma ave de rapina?\n");
                    scanf(" %c", &eA2);

                    if(eA2=='s'){//se for ave de rapina
                            printf("o animal eh uma Aguia\n");

                    }else{//se n�o for ave de rffapina
                        printf("o animal eh um pato\n");
                    }
                }

        }else{//se n�o for uma ave
            printf("Eh um reptil?\n");
            scanf(" %c", &e3);


            if(e3=='s'){//se for um reptil
                    printf("Tem casco?\n");
                    scanf(" %c", &eR1);
                    if(eR1=='s'){//se tiver casco
                            printf("O animal eh uma tartaruga\n");

                    }else{//se n�o tiver casco
                        printf("Eh carnivoro?\n");
                        scanf(" %c", &eR2);
                        if(eR2=='s'){//se for carnivoro
                                printf("O animal eh um crocodilo\n");

                        }else{//se n�o for carnivoro
                            printf("O animal eh a cobra\n");

                        }


                    }



            }else{//se n�o for um reptil
                printf("ERRO!\n");
            }
        }
    }


    }else{
        printf("JOGO ENCERRADO!\n");
    }





    return 0;
}
