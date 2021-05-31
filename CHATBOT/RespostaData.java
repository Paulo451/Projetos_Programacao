import java.util.Calendar;
public class RespostaData extends Resposta{

    private String entradaUser;
    private int dia;
    private int mes;
    private int ano;

    public RespostaData(String entradaUser){
        Calendar calendar = Calendar.getInstance();
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.ano = calendar.get(Calendar.YEAR);
        this.entradaUser = entradaUser;
    }

    @Override
    public boolean verifica(String entrada){
        return this.entradaUser.equals(entrada);
    }

    @Override
    public String produz(){
        return "Hoje é dia" + this.dia + "/"  +  this.mes  + "/"  + this.ano;
    }
}
