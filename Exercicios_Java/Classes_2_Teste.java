import java.util.Scanner;
public class Classes_2_Teste {

    //método main inicia a execução do aplicativo Java
    public static void main ( String[] args)
    {
        Classes_2 account1 = new Classes_2(50.00);
        Classes_2 account2 = new Classes_2(-7.53);

        //exibe o saldo inicial de cada objeto
        System.out.printf("Saldo conta 1: R$%.2f \n", account1.getBalance() );
        System.out.printf("Saldo da conta 2: R$%.2f \n", account2.getBalance());

        //cria Scanner pra obter entrada a partir da janela de comando
        Scanner entrada = new Scanner(System.in);
        double depositAmount;

        System.out.println("Digite a quantia para depositar na conta 1: ");
        depositAmount = entrada.nextDouble();
        System.out.printf("Depositado %.2f ao seu saldo \n", depositAmount);
        account1.credit( depositAmount );

        //exibe os saldos
        System.out.printf("conta 1 saldo: R$%.2f \n", account1.getBalance());
        System.out.printf("conta 2 saldo: R$%.2f \n", account2.getBalance());


        System.out.println("Digite a quantia para depositar na conta 2: ");
        depositAmount = entrada.nextDouble();
        System.out.printf("Depositado %.2f ao seu saldo\n", depositAmount);
        account2.credit( depositAmount );

        //exibe os saldos
        System.out.printf("conta 1 saldo: R$%.2f \n", account1.getBalance());
        System.out.printf("conta 2 saldo: R$%.2f", account2.getBalance());


    }


}
