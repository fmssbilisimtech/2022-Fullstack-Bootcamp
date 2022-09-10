package fifthweek.gamerunner;

public class AngryBirdsGame extends AbstractGame {
    //...

    public AngryBirdsGame()
    {
        super("Angry Birds");
    }

    public void start()
    {
        System.out.println("Angry Birds start");
    }
    public void play()
    {
        System.out.println("Angry Birds play");
    }

    public void pause()
    {
        System.out.println("Angry Birds pause");
    }
    //...
    public void end()
    {
        System.out.println("Angry Birds end");
    }
}