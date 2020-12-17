#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include<time.h>

//prot�tipo
   int randDados();
   int game(int dados);
   int game2(int dados, int jogada1);

int main()
{
   //declara��o de avraiveis

   char escolha;
   int forca, dados,flag1,jogada1, flag2;
   //entrada
   printf("======CRAPS=======\n");
   printf("Deseja jogar(s/n)?\n");
   scanf("%c", &escolha);
if(escolha=='s'||escolha=='S'){
    printf("Pressione um numero de 1 a 10 para escolher a forca que jogar� os dados\n");
    scanf("%i", &forca);
        printf("Jogando os dados...\n");
                    if(forca>=0 && forca<=5){
                        Sleep(3000);
                    }
                    if(forca>=6 && forca<=10){
                        Sleep(5000);
                    }
        dados=randDados();
        jogada1=dados;
        printf("Voc� tirou o numero %i", dados);

        flag1=game(dados);

        if(flag1==0){
            do{
            flag2=game2(dados, jogada1);
            }while(flag2==0);

        }else{
        printf("Fim do jogo\n");
        }


}else{
   printf("Fim do jogo\n");
}
if(flag2==1){
    printf("Fim de jogo\n");
}

    return 0;
}
//funcoes

int randDados(){
    srand(time(NULL));
    int dados=0;
        dados=rand()%11+2;
    return dados;
}
int game(int dados){
    int flag1=0;

            if(dados==7 || dados==11){
                printf("\nVoc� � um natural, voce ganhou!\n");
                flag1=1;
            }
            if(dados==2||dados==3||dados==12){
                printf("\nCRAPS!voce perdeu!\n");
                flag1=1;
            }
            if(dados==4||dados==5||dados==6||dados==8||dados==9||dados==10){
                printf("\nPONTO!\n");
            }
            dados=0;
        return flag1;
}
int game2(int dados, int jogada1){
    int flag2=0, forca;
    char escolha2;
        printf("Pressione s para jogar dados novamente e n para sair do jogo\n");
        scanf(" %c", &escolha2);
                if(escolha2=='s'){
                        printf("Pressione um numero de 1 a 10 para escolher a forca que jogar� os dados\n");
                        scanf("%i", &forca);
                        dados=randDados();
                        printf("Jogando os dados...\n");
                                if(forca>=0 && forca<=5){
                                    Sleep(3000);
                                }
                                if(forca>=6 && forca<=10){
                                    Sleep(5000);
                                }
                    printf("Voc� tirou o numero %i", dados);
                    if(dados==jogada1){
                    printf("\nVoc� venceu!\n");
                        flag2=1;
                    }
                    if(dados==7){
                        printf("\nVoc� perdeu!\n");
                        flag2=1;
                    }
                    if(!(dados==jogada1)&& flag2==0){
                        printf("\nJogue novamente!\n");
                    }

                }else{
                    flag2=1;
                }

        return flag2;
}
