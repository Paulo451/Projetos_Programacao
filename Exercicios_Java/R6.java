public class R6 {
    private int dia;
    private int mes;
    private int ano;

    public R6(int day, int month, int year)
    {
        dia = day;
        mes = month;
        ano = year;
    }
    //set e get de dia
    public void setDia(int day)
    {
        dia = day;
    }
    public int getDia()
    {
        return dia;
    }

    //set e get de mes
    public void setMes(int month)
    {
        mes = month;
    }
    public int getMes()
    {
        return mes;
    }

    //set e get ano
    public void setAno(int year)
    {
        ano = year;
    }
    public int getAno(){
        return ano;
    }

    public void displaydate()
    {
        System.out.printf("%d/%d/%d\n", dia, mes, ano);
    }
}
