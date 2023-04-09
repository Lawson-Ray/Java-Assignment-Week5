import java.util.Scanner;


public class App
{
    public static String scanString()
    {
        Scanner receiveString = new Scanner(System.in);
        System.out.print("Please type in a String of characters... or mash keys on the keyboard now: ");
        String newString = receiveString.next();
        return newString;
    }
    public static void main(String[] args)
    {
        String inputWord = scanString();
        AsteriskLogger asteriskOutput = new AsteriskLogger();
        SpacedLogger spaceOutput = new SpacedLogger();
        asteriskOutput.Log(inputWord);
        asteriskOutput.Error(inputWord);
        spaceOutput.Log(inputWord);
        spaceOutput.Error(inputWord);

    }


}