public class teste {
    public static void main(String[] args) {
        filaDinamica f = new filaDinamica();

        for(int i = 0; i < 1000000; i++)
        {
            f.entra(i+7*8-9/4+5+4*6-1000/5*200+99000*5+7);
        }

        System.out.println("Tamanho: " + f.tamanho());

        while(!f.vazia())
        {
            System.out.println(f.sai());
        }

        System.out.println(f.sai());
    }
}
