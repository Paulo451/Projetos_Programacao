public class Cal_Hipo {
    private double side1;
    private double side2;

    public Cal_Hipo(int s1, int s2)
    {
        this.side1 = s1;
        this.side2 = s2;
    }
    public double hypotenuse()
    {
        return (Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,2)));
    }
}
