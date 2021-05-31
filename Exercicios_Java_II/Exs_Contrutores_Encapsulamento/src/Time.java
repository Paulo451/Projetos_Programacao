public class Time {
    private int horas;
    private int min;
    private int seg;

    public Time(int horas, int min, int seg)
    {
        if(horas < 24 && horas >= 0)
        {
            this.horas = horas;
        }
        if(min <= 59 && min >= 0 || seg <= 59 && seg >= 0)
        {
            this.min = min;
            this.seg = seg;
        }
    }

    public String vizualizarHoraUniversal()
    {
        return String.format("%d:%d:%d", this.horas, this.min, this.seg);
    }

    public String vizualizarHoraAmPm()
    {
        if(this.horas > 12)
        {
            return String.format("%d:%d:%d PM", this.horas-12,this.min, this.seg);
        }else{
            return String.format("%d:%d:%d AM", this.horas, this.min, this.seg);
            }
    }
}
