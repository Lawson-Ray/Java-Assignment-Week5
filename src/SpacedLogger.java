public class SpacedLogger implements Logger
{
    @Override
    public void Log(String word)
    {
        int counter = 0;
        StringBuilder spacedWord = new StringBuilder(word);
        while (counter < word.length())
        {
            spacedWord.insert(counter * 2 + 1, " ");
            counter++;
        }
        System.out.println(spacedWord);
    }

    @Override
    public void Error(String word)
    {
        System.out.print("Error: ");
        Log(word);
    }

}
