import java.util.Calendar;
public class RespostaHora extends Resposta{

    private int hora;
    private int minuto;
    private String entradaUser;

    public RespostaHora(String entradaUser) {
        Calendar horas = Calendar.getInstance();
        this.hora = horas.get(Calendar.HOUR_OF_DAY);
        this.minuto = horas.get(Calendar.MINUTE);
        this.entradaUser = entradaUser;
    }

    @Override
    public boolean verifica(String entrada) {
       return this.entradaUser.equals(entrada);
    }

    @Override
    public String produz(){
        return "São" + this.hora + "horas e " + this.minuto + "minutos";
    }
}
