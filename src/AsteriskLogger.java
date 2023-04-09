

public class AsteriskLogger implements Logger
{

    @Override
    public void Log(String word)
    {
        System.out.println("***" + word + "***");
    }

    @Override
    public void Error(String word)
    {
        StringBuilder errorMessage = new StringBuilder("***Error: " + word + "***");
        StringBuilder asteriskBox = new StringBuilder(errorMessage.capacity());
        for (int i = 0; i < errorMessage.length(); i++)
        {
            asteriskBox.insert(i, "*");
        }
        System.out.println(asteriskBox);
        System.out.println(errorMessage);
        System.out.println(asteriskBox);
    }

}
