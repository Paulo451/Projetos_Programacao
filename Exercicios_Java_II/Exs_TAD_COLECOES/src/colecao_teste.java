public class colecao_teste {
    public static void main(String[] args) {
        Colecao c = new Colecao(7);

        c.inserir(10);
        c.inserir(10);
        c.inserir(17);
        c.inserir(2);
        c.inserir(69);
        c.inserir(1);

        System.out.println(c);

//        if(c.deletar(10))
//        {
//            System.out.println("Valor encontrado");
//        }else
//            {
//                System.out.println("Valor não encontrado");
//            }

        c.reset();

        c.inserir(44);

        System.out.println(c);
    }
}
