
#include <stdio.h>
#include <stdlib.h>
#define TAM 25
int main(){
	//prototipos
	void mapaOcupacao(int janela[], int corredor[]);//mostra o mapa de ocupa��o
	void venderPassagem (int janela[], int corredor[]);//fun��o principal para venda de passagens
    int venderPassagemJanela(int janela[], int assento);//venda janela
    int venderPassagemCorredor(int corredor[],int assento);//venda corredor
	//declara��o de variavies
	int janela[TAM], corredor[TAM], menu=0,flag2=0;
	int i;
  	//zerando array
  	for(i=0;i<TAM;i++){
		janela[i]=0;
	}
	for(i=0;i<TAM;i++){
		corredor[i]=0;
	}
	//entrada
	do{//Repeti��o do programa
        do{//verifica��o de entrada para o menu
        printf("=====MENU=====\n");
        printf("\n-1 Vender passagem\n");
        printf("-2 Mapa de ocupacao\n");
        printf("-3 Encerrar Programa\n");
        fflush(stdin);
        scanf("%i", &menu);
            if(!(menu==1 || menu==2 || menu==3)){//mensagem de erro menu
                printf("ERRO!, escolha uma opcao valida (1,2 ou 3)\n");
            }
        }while(!(menu==1 || menu==2 || menu==3));
		switch(menu){
			case(1)://vender passagem
				venderPassagem(janela, corredor);
			break;
			case(2)://mostrar mapa de ocupa��o
				mapaOcupacao(janela,corredor);
			break;
			case(3)://encerrar programa
        	flag2=1;
        	exit (0);
      		break;
        }
    }while(flag2==0);
	return 0;
}//fim da main

//fun��o vender passagem
void venderPassagem (int janela[], int corredor[]){
	char choice;
	int assento, flag1=0,cont=0;
		do{//valida��o assento ocupado
			do{//valida��o janela/corredor
            flag1=0;
			printf("Digite j para janela e c para corredor\n");
			scanf(" %c", &choice);
                if(!(choice=='j') && !(choice=='c')){
                 printf("Erro!, a escolha deve ser ou j ou c\n");
                }
			}while(!(choice=='j') && !(choice=='c'));
			do{//valida��o assento
            printf("Digite o assento desejado:\n");
			scanf("%i", &assento);
                if(!(assento>0 && assento<25)){
                    printf("ERRO, o numero do assento deve estar entre 1 e 24\n");
                }
			}while(!(assento>0 && assento<25));
			if(janela[assento]==1 && choice=='j'){//valida��o assento ocupado
				printf("\nAssento ocupado!\n");
				printf("Escolha outro assento\n\n");
				flag1=1;
			}
			if(corredor[assento]==1){//valida��o assento ocupado
				printf("\nAssento ocupado!\n");
				printf("Escolha outro assento\n\n");
				flag1=1;
			}
			if(flag1==0){//impress�o mensagem de sucesso na compra
        	printf("Compra efetuada!\n");
        	cont++;
			}

		}while(flag1=0);
		if(choice=='j'){
			venderPassagemJanela(janela, assento);

		}else{
			venderPassagemCorredor(corredor, assento);
		}
		if(cont>=48){//impress�o da mensagem onibus lotado
            printf("Onibus lotado");
            exit(0);
		}
}
//fun��o vender passsagem da janela
int venderPassagemJanela(int janela[], int assento){
		janela[assento]=1;
		return janela;
}
//fun��o vender passagem corredor
int venderPassagemCorredor(int corredor[],int assento){
		corredor[assento]=1;
		return assento;
}

//fun��o mapa de ocupa��o
void mapaOcupacao(int janela[], int corredor[]){
		int i;
		for(i=1;i<TAM;i++){
		printf("\nJanela     Corredor\n");
		if(janela[i]==0){//caso janela livre
			if(corredor[i]==0){//caso corredor ocupado
				printf("%i-Livre     %i-Livre\n", i,i);
			}else{//caso corredor ocupado
				printf("%i-Livre     %i-Ocupado\n", i,i);
			}
		}else{//caso janela ocupado
			if(corredor[i]==0){//caso corredor livre
				printf("%i-Ocupado     %i-Livre\n", i,i);
			}else{//caso corredor ocupado
				printf("%i-Ocupado     %i-Ocupado\n", i,i);
			}
		}
	}
}



/*
flag1=caso assento ocupado, muda para 1, fazendo assim a mensagem de compra efetuada n�o aparece e a linha segue o fluxo
flag2=para o programa continuar a execu��o
cont=para contagem do numero de passagens e para exibi��o da mensgaem onibus lotado
*/

