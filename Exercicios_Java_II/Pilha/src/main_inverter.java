public class main_inverter {
    public static void main(String[] args) {

        String teste = "Oi tudo bem, meu nome é Paulo, eu gostaria de uma ajuda, seria possivel?";

        int cont = 0;


        String[] result = teste.split("");

        for(int i = 0; i < result.length; i++)
        {
            cont++;
        }

        Stack s1 = new Stack(cont);

        for(int i = 0; i < result.length; i++)
        {
            char log = result[i].charAt(0);
            s1.push(log);
        }

        while (!s1.isEmpty())
        {
            System.out.print(s1.pop());
        }
    }
}
