import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner entrada = new Scanner(System.in);

        // leia idade e nome
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        // mostre se a pessoa tem mais de 18 anos
        if(idade > 18){
            System.out.println(nome + " Você é maior de 18!");
        } else {
            System.out.println(nome + " Sua idade é menor ou igual a 18!");
        }
    }
}
