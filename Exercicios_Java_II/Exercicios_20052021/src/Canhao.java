public class Canhao {
    private Bala bala;
    private int velocidade;
    private double ang;


    public Canhao() {
        this.bala = new Bala(0, 0);
    }

    public void disparar(int velocidade, double ang)
    {
        this.velocidade = velocidade;
        this.ang = Math.toRadians(ang);
    }

    public double getAlcanceMaximo()
    {
        return 2 * (velocidade*velocidade)*((Math.sin(ang)*Math.cos(ang))/9.81);
    }

    public void setBala(Bala bala) {
        this.bala = bala;
    }
}
