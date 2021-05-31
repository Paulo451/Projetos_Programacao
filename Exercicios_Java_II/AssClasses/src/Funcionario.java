public class Funcionario {
    private String nome;
    private String ocupacao;
    private Data nascimento;
    private Data contratacao;

    public Funcionario(String nome, String ocupacao, int dia, int mes, int ano, int dia2, int mes2, int ano2)
    {
        Data nascimento = new Data(dia, mes, ano);
        Data contratacao = new Data(dia2, mes2, ano2);
        this.nascimento = nascimento;
        this.contratacao = contratacao;
        this.nome = nome;
        this.ocupacao = ocupacao;

    }

    public String toString()
    {
        return String.format("Nome: %s\n Ocupacao: %s\n " +
                "Data de Nascimento: " + this.nascimento +
                "\nData de contratação: " + this.contratacao, this.nome, this.ocupacao);
    }
}


//• Crie uma classe Funcionário que deve possuir:
//        – nome, ocupação, data de nascimento e data de contratação.
//        – uma data tem os seguintes atributos:
//        ¨ dia, mês e ano.
//        – e o seguinte comportamento:
//        ¨ retornar o data no formato dd/mm/aaaa;
//        • Modele esse cenário:
//        – primeiro tente modelar a situação em um papel;
//        – depois programe as classes e faça uma classe com main para testar