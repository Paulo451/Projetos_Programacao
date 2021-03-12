public class quadado {
    private int side;

    public quadado(int s)
    {
        this.side = s;
    }

    public void squareOfAsterisks()
    {
        for(int i = 0; i < side; i++)
        {
            for(int l = 0; l < side; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
