import java.util.Scanner;
public class labirinto_robo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String direcao;
		int distancia, distFalta = 0;
		int bateria;
		bateria = 700;
		
		int estado = 0;
		direcao = "";
		distancia = 0;
		int oldDirecao	= 0;
		
		/* TODOS OS COMANDOS 
		 *1�- Frente, 5
		 *2�- Direita, 4
		 *3�- Esquerda, 4
		 *4�- Esquerda, 4
		 *5�- Direita, 5
		 * */
		
		/*
		 * estado 0 � o primeira etapa
		 * estado 1 � a segunda etapa
		 * estado 2 � a terceira etapa
		 * estado 3 � a quarta etapa
		 * estado 4 � a quinta etapa 
		 * estado 5 � a conclus�o
		 * estado 6 � o erro ou game over
		 * */
		
		System.out.println("- Ol�, bem vindo ao labirinto, as regras s�o simples:\n");
		System.out.println("1- Voc� dever� chegar ao final do labirinto sem saber como � o labirinto.");
		System.out.println("2- Voc� dever� digitar dois comandos para simular o movimento do rob� na pista.(EX: Frente, 2 / Direita, 6)");	
		System.out.println("3- A cada comando inserido, a tecla enter dever� ser pressionada para que o rob� compute o movimento ou dire��o.");
		System.out.println("4- O seu rob� tem 700W de bateria, cada par de comando custa 100W do rob�, se antes do final do percurso sua bateria acabar, o jogo acaba.");
		System.out.println("5- O percurso pode ser completado com 500W de bateria, restando 200W ao final do labirinto, mas cuidado, voc� s� pode errar 2 vezes para conseguir concluir.");
		System.out.println("6- A dist�ncia � computada em casas, cada valor equivale a uma unidade de casa que o rob� ir� andar.\n");
		System.out.println("- Tenha uma boa sorte e divirta-se chegando ao final do percurso!\n");
		
		//primeira reta - frente, 5
		distFalta = 5;
		while(estado == 0 && bateria !=0) {
			System.out.print("- Digite a dire��o que o rob� deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo rob� --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu rob� andou para " +direcao + ", " +distancia + " casas! Voc� passou para a pr�xima etapa!");
				estado = 1;
			} else if ((!direcao.equalsIgnoreCase("frente") || distancia >= 5 )&& oldDirecao == 0) {
				//erro de dire��o /game over
				System.out.println("- Dire��o ou Dist�ncia esta errada, o seu rob� colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("frente") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acerto de dire��o mas erro de distancia / ainda tem vida
				System.out.println("- Dist�ncia "+distancia + " casas! Voc� passou para a pr�xima etapa!");	
				estado = 1;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 5 && oldDirecao == 1 ) {
				//erro de dire��o /n�o tem vida / ainda tem vida
				System.out.println("- Dire��o "+direcao + " est� errada, o seu rob� colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;
		//segunda reta - direita, 4
		distFalta = 4;
		while(estado == 1 && bateria !=0) {
			System.out.print("- Digite a dire��o que o rob� deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo rob� --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("direita") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu rob� andou para " +direcao+ ", " +distancia +" casas! Voc� passou para a pr�xima etapa!");
				estado = 2;
			} else if ((!direcao.equalsIgnoreCase("direita") || distancia >= 4 )&& oldDirecao == 0) {
				//erro de dire��o /game over
				System.out.println("- Dire��o ou Dist�ncia esta errada, o seu rob� colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("direita") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acertei a dire��o mas errei a distancia / ainda tem vida
				System.out.println("- O seu rob� andou para " +direcao + ", " +distancia + " casas! Voc� passou para a pr�xima etapa!");	
				estado = 2;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 4 && oldDirecao == 1 ) {
				//erro de dire��o /n�o tem vida / ainda tem vida
				System.out.println("- Dire��o "+direcao + " est� errada, o seu rob� colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;
		//terceira reta - esquerda, 4
		distFalta = 4;
		while(estado == 2 && bateria !=0) {
			System.out.print("- Digite a dire��o que o rob� deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo rob� --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("esquerda") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu rob� andou para " +direcao+ ", " +distancia + " casas! Voc� passou para a pr�xima etapa!");
				estado = 3;
			} else if ((!direcao.equalsIgnoreCase("esquerda") || distancia >= 4 )&& oldDirecao == 0) {
				//erro de dire��o /game over
				System.out.println("- Dire��o ou Dist�ncia esta errada, o seu rob� colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("esquerda") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acertei a dire��o mas errei a distancia / ainda tem vida
				System.out.println("- O seu rob� andou para " +direcao + ", " +distancia + " casas! Voc� passou para a pr�xima etapa!");	
				estado = 3;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 4 && oldDirecao == 1 ) {
				//erro de dire��o /n�o tem vida / ainda tem vida
				System.out.println("- Dire��o "+direcao + " est� errada, o seu rob� colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;		
		//quarta reta - esquerda, 4
		distFalta = 4;
		while(estado == 3 && bateria !=0) {
			System.out.print("- Digite a dire��o que o rob� deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo rob� --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("esquerda") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu rob� andou para " +direcao+ ", " +distancia + " casas! Voc� passou para a pr�xima etapa!");
				estado = 4;
			} else if ((!direcao.equalsIgnoreCase("esquerda") || distancia >= 4 )&& oldDirecao == 0) {
				//erro de dire��o /game over
				System.out.println("- Dire��o ou Dist�ncia esta errada, o seu rob� colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("esquerda") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acertei a dire��o mas errei a distancia / ainda tem vida
				System.out.println("- O seu rob� andou para " +direcao + ", " +distancia + " casas! Voc� passou para a pr�xima etapa!");	
				estado = 4;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 4 && oldDirecao == 1 ) {
				//erro de dire��o /n�o tem vida / ainda tem vida
				System.out.println("- Dist�ncia "+distancia + " est� errada, o seu rob� colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;
		//quinta reta - direita, 5
		distFalta = 5;
		while(estado == 4 && bateria !=0) {
			System.out.print("- Digite a dire��o que o rob� deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo rob� --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("direita") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu rob� andou para " +direcao + ", " +distancia + " casas!");
				estado = 5;
			} else if ((!direcao.equalsIgnoreCase("direita") || distancia >= 5 )&& oldDirecao == 0) {
				//erro de dire��o /game over
				System.out.println("- Dire��o ou Dist�ncia esta errada, o seu rob� colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("direita") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acerto de dire��o mas erro de distancia / ainda tem vida
				System.out.println("- O seu rob� andou para " +direcao + ", " +distancia + " casas!");	
				estado = 5;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 5 && oldDirecao == 1 ) {
				//erro de dire��o /n�o tem vida / ainda tem vida
				System.out.println("- Dire��o " +direcao + " esta errada, o seu rob� colidiu!");	
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Dire��o certa, voc� andou " +distancia +  " casas mas ainda n�o chegou na pr�xima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		
		//verifica��o de estado
		if(estado == 5) {
			System.out.println("- Parab�ns, voc� chegou ao final! Bateria do rob�: "+bateria);			
		}else if (estado == 6) {
			System.out.println("- Game Over, tente novamente! Bateria do rob�: "+bateria);		
		}else if(bateria == 0) {
			System.out.println("- O rob� ficou sem bateria! Game Over!");
		}

		
		teclado.close();
	}
}

