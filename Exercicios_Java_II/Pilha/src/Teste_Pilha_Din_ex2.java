public class Teste_Pilha_Din_ex2 {
    public static void main(String[] args) {
        Pilha_dinamica p1 = new Pilha_dinamica();

        String exp = "2 3 5 * +";
        String[] res = exp.split("");
        double res1;

        for(int i = 0; i < res.length; i++)
        {
            if(res[i].equals(" "))
            {
                res1 = '&';
            }else {
                res1 = Double.parseDouble(res[i]);
            }
            p1.push(res1);
        }

        while (!p1.isEmpty())
        {
            System.out.println(p1.pop());
        }


    }
}
