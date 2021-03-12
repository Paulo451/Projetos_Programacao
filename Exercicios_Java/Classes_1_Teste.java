import java.util.Scanner;

public class Classes_1_Teste {

    public static void main( String[] args)
    {
        //cria um scanner
        Scanner entrada = new Scanner(System.in);

        //cria um objeto Classes_1 e o atribui para teste
        Classes_1 teste = new Classes_1("Java");
        Classes_1 teste2 = new Classes_1("Python");

        //exibe o valor inicial de coursename
        System.out.printf(" Valor inicial do nome do curso: %s\n", teste.getCourseName() );
        System.out.printf(" Valor inicial do nome do curso: %s\n", teste2.getCourseName() );

        /*
        // entrada do nome do curso
        System.out.println("Digite o nome do curso: ");
        String nomeDOCurso = entrada.nextLine();
        teste.setCourseName( nomeDOCurso ); //setando o nome do curso
        System.out.println();

        //chama método displayMessage de Classes_1
        teste.displayMessage();
        */

    }
}
