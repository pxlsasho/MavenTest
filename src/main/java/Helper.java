import java.util.Random;

public class Helper
{
    //Fields
    private final String helloField = "Hello";
    private static String message;

    //Methods
    public static int GerRandomNumber()
    {
        Random rand = new Random();
        int n = rand.nextInt(50);
        int h = 50;
        return  n;
    }
}
