public class Biblioteca {
    private String nome;
    private boolean disponibilidade;
    private Fila_String f1;
    private int flag1;


    public Biblioteca(String nome, boolean disponibilidade, Fila_String f1)
    {
        this.nome = nome;
        this.disponibilidade = disponibilidade;
        this.f1 = f1;
        this.flag1 = 0;

    }

    public void mudarDisponivel()
    {
        if(this.disponibilidade)
        {
            this.disponibilidade = false;
        }else
        {
            this.flag1 = 1;
            this.disponibilidade = true;
        }
    }

    public void alugarLivro(String nomePessoa)
    {
        if(disponibilidade)
        {
            mudarDisponivel();
            if(this.flag1 == 1)
            {
                System.out.printf("Livro alugado para %s\n", f1.sai());
                System.out.printf("%s entrou na fila\n", nomePessoa);
                this.f1.entra(nomePessoa);
            }else {
                System.out.printf("Livro alugado para %s\n", nomePessoa);
            }
        }else{

            System.out.printf("%s entrou na fila\n", nomePessoa);
            this.f1.entra(nomePessoa);
        }
    }



}
