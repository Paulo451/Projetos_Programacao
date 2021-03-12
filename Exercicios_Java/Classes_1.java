public class Classes_1 {

    private String courseName;

    public Classes_1 ( String name) // o construtor inicializa o Classes_1 com o argumento String
    {
        courseName = name;
    }

    public void setCourseName( String name )
    {
        courseName = name;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void displayMessage()
    {
        System.out.printf("Welcome to the Grade Book for\n%s!\n", getCourseName());
    }
}
