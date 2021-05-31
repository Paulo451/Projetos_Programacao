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
		 *1°- Frente, 5
		 *2°- Direita, 4
		 *3°- Esquerda, 4
		 *4°- Esquerda, 4
		 *5°- Direita, 5
		 * */
		
		/*
		 * estado 0 é o primeira etapa
		 * estado 1 é a segunda etapa
		 * estado 2 é a terceira etapa
		 * estado 3 é a quarta etapa
		 * estado 4 é a quinta etapa 
		 * estado 5 é a conclusão
		 * estado 6 é o erro ou game over
		 * */
		
		System.out.println("- Olá, bem vindo ao labirinto, as regras são simples:\n");
		System.out.println("1- Você deverá chegar ao final do labirinto sem saber como é o labirinto.");
		System.out.println("2- Você deverá digitar dois comandos para simular o movimento do robô na pista.(EX: Frente, 2 / Direita, 6)");	
		System.out.println("3- A cada comando inserido, a tecla enter deverá ser pressionada para que o robô compute o movimento ou direção.");
		System.out.println("4- O seu robô tem 700W de bateria, cada par de comando custa 100W do robô, se antes do final do percurso sua bateria acabar, o jogo acaba.");
		System.out.println("5- O percurso pode ser completado com 500W de bateria, restando 200W ao final do labirinto, mas cuidado, você só pode errar 2 vezes para conseguir concluir.");
		System.out.println("6- A distância é computada em casas, cada valor equivale a uma unidade de casa que o robô irá andar.\n");
		System.out.println("- Tenha uma boa sorte e divirta-se chegando ao final do percurso!\n");
		
		//primeira reta - frente, 5
		distFalta = 5;
		while(estado == 0 && bateria !=0) {
			System.out.print("- Digite a direção que o robô deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo robô --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu robô andou para " +direcao + ", " +distancia + " casas! Você passou para a próxima etapa!");
				estado = 1;
			} else if ((!direcao.equalsIgnoreCase("frente") || distancia >= 5 )&& oldDirecao == 0) {
				//erro de direção /game over
				System.out.println("- Direção ou Distância esta errada, o seu robô colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("frente") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acerto de direção mas erro de distancia / ainda tem vida
				System.out.println("- Distância "+distancia + " casas! Você passou para a próxima etapa!");	
				estado = 1;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 5 && oldDirecao == 1 ) {
				//erro de direção /não tem vida / ainda tem vida
				System.out.println("- Direção "+direcao + " está errada, o seu robô colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;
		//segunda reta - direita, 4
		distFalta = 4;
		while(estado == 1 && bateria !=0) {
			System.out.print("- Digite a direção que o robô deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo robô --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("direita") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu robô andou para " +direcao+ ", " +distancia +" casas! Você passou para a próxima etapa!");
				estado = 2;
			} else if ((!direcao.equalsIgnoreCase("direita") || distancia >= 4 )&& oldDirecao == 0) {
				//erro de direção /game over
				System.out.println("- Direção ou Distância esta errada, o seu robô colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("direita") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acertei a direção mas errei a distancia / ainda tem vida
				System.out.println("- O seu robô andou para " +direcao + ", " +distancia + " casas! Você passou para a próxima etapa!");	
				estado = 2;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 4 && oldDirecao == 1 ) {
				//erro de direção /não tem vida / ainda tem vida
				System.out.println("- Direção "+direcao + " está errada, o seu robô colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;
		//terceira reta - esquerda, 4
		distFalta = 4;
		while(estado == 2 && bateria !=0) {
			System.out.print("- Digite a direção que o robô deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo robô --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("esquerda") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu robô andou para " +direcao+ ", " +distancia + " casas! Você passou para a próxima etapa!");
				estado = 3;
			} else if ((!direcao.equalsIgnoreCase("esquerda") || distancia >= 4 )&& oldDirecao == 0) {
				//erro de direção /game over
				System.out.println("- Direção ou Distância esta errada, o seu robô colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("esquerda") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acertei a direção mas errei a distancia / ainda tem vida
				System.out.println("- O seu robô andou para " +direcao + ", " +distancia + " casas! Você passou para a próxima etapa!");	
				estado = 3;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 4 && oldDirecao == 1 ) {
				//erro de direção /não tem vida / ainda tem vida
				System.out.println("- Direção "+direcao + " está errada, o seu robô colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;		
		//quarta reta - esquerda, 4
		distFalta = 4;
		while(estado == 3 && bateria !=0) {
			System.out.print("- Digite a direção que o robô deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo robô --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("esquerda") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu robô andou para " +direcao+ ", " +distancia + " casas! Você passou para a próxima etapa!");
				estado = 4;
			} else if ((!direcao.equalsIgnoreCase("esquerda") || distancia >= 4 )&& oldDirecao == 0) {
				//erro de direção /game over
				System.out.println("- Direção ou Distância esta errada, o seu robô colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("esquerda") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acertei a direção mas errei a distancia / ainda tem vida
				System.out.println("- O seu robô andou para " +direcao + ", " +distancia + " casas! Você passou para a próxima etapa!");	
				estado = 4;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 4 && oldDirecao == 1 ) {
				//erro de direção /não tem vida / ainda tem vida
				System.out.println("- Distância "+distancia + " está errada, o seu robô colidiu!");
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		oldDirecao = 0;
		//quinta reta - direita, 5
		distFalta = 5;
		while(estado == 4 && bateria !=0) {
			System.out.print("- Digite a direção que o robô deve seguir --> ");
			direcao = teclado.next();
			System.out.print("- Digite a distancia a ser percorrida pelo robô --> ");
			distancia = teclado.nextInt();
			distFalta = distFalta - distancia;	
			
			if(direcao.equalsIgnoreCase("direita") && (distFalta == 0) && (bateria != 0) && oldDirecao == 0) {
				//acertou de primeira
				System.out.println("- O seu robô andou para " +direcao + ", " +distancia + " casas!");
				estado = 5;
			} else if ((!direcao.equalsIgnoreCase("direita") || distancia >= 5 )&& oldDirecao == 0) {
				//erro de direção /game over
				System.out.println("- Direção ou Distância esta errada, o seu robô colidiu!");
				estado = 6;
			} else if (direcao.equalsIgnoreCase("direita") && distFalta != 0 && oldDirecao == 0 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			} else if (direcao.equalsIgnoreCase("frente") && (distFalta == 0) && (bateria != 0) && ( oldDirecao == 1 )) {
				//acerto de direção mas erro de distancia / ainda tem vida
				System.out.println("- O seu robô andou para " +direcao + ", " +distancia + " casas!");	
				estado = 5;
			} else if (!direcao.equalsIgnoreCase("frente") || distancia >= 5 && oldDirecao == 1 ) {
				//erro de direção /não tem vida / ainda tem vida
				System.out.println("- Direção " +direcao + " esta errada, o seu robô colidiu!");	
				estado = 6;
			} else if (distFalta != 0 && oldDirecao == 1 ) {
				//erro de distancia / ainda tem vida
				System.out.println("- Direção certa, você andou " +distancia +  " casas mas ainda não chegou na próxima etapa, tente outro valor.");	
				oldDirecao = 1;
			}
		bateria = bateria - 100;
		}
		
		//verificação de estado
		if(estado == 5) {
			System.out.println("- Parabéns, você chegou ao final! Bateria do robô: "+bateria);			
		}else if (estado == 6) {
			System.out.println("- Game Over, tente novamente! Bateria do robô: "+bateria);		
		}else if(bateria == 0) {
			System.out.println("- O robô ficou sem bateria! Game Over!");
		}

		
		teclado.close();
	}
}

