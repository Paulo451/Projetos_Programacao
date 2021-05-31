import java.util.Scanner;
public class Pilha_ex03 {
    public static void main(String[] args) {
        Pilha_char s = new Pilha_char(50);
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        entrada.close();

        for(int i = 0; i < frase.length(); i++)
        {
            char caracter = frase.charAt(i);

            if(caracter == '(' || caracter == '[' || caracter == '{')
            {
                s.push(caracter);
            }else if( caracter == ')' || caracter == ']' || caracter == '}')
            {
                char naPilha = ' ';

                if(s.isEmpty())
                {
                    System.out.println("Erro - Fechamento sem abertura");
                    return;
                }

                naPilha = s.pop();

                if (caracter == ')' && naPilha == '(' || caracter == ']' && naPilha == '[' || caracter == '}' && naPilha == '{')
                {
                    continue;
                }else
                    {
                        System.out.println("Erro - Delimitador incorreto");
                        System.out.println("Abertura: " + naPilha);
                        System.out.println("Fechamento: " + caracter);
                        return;
                    }
            }

        }

        if(s.isEmpty())
            System.out.println("Correto");
        else
            System.out.println("Erro- Abertura sem fechamento");
    }
}
