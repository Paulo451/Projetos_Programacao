import java.util.Scanner;
public class Menor_teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que deseja verificar");
        int qtd = entrada.nextInt();
        Menor teste = new Menor(qtd);
        teste.encontrandoMenor();
    }
}
