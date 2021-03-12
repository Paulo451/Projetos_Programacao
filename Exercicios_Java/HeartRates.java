import java.util.Date;

public class HeartRates {
    //declaração de variavies
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private final int diaAtual;
    private final int mesAtual;
    private final int anoAtual;

    public HeartRates(String name, String lastName, int day, int month, int year, int dayAt, int monthAt, int yearAt)
    {
        nome = name;
        sobrenome = lastName;
        dia = day;
        mes = month;
        ano = year;
        diaAtual = dayAt;
        mesAtual = monthAt;
        anoAtual = yearAt;
    }
    //métodos set
    public void setNome(String name)
    {
        nome = name;
    }
    public void setSobrenome(String lastName)
    {
        sobrenome = lastName;
    }
    public void setDia(int day)
    {
        dia = day;
    }
    public void setMes(int month)
    {
        mes = month;
    }
    public void setAno(int year)
    {
        ano = year;
    }

    //métodos get
    public String getNome()
    {
        return nome;
    }
    public String getSobrenome()
    {
        return sobrenome;
    }
    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAno()
    {
        return ano;
    }

    //método idade
    public int calcularIdade()
    {

        if(dia > diaAtual & mes <= mesAtual)
        {
            return anoAtual - ano;
        }else
        {
            return anoAtual - (ano+1);
        }
    }

    //método frequencia cardiaca máxima
    public int fmax()
    {
        return 220 - calcularIdade();
    }

    //método frequencia cardiaca alvo
    public String falvo()
    {
        return String.format("%.0f-%.0f", fmax()*0.5, fmax()*0.8);
    }
}
