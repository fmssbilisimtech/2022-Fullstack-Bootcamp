package fifthweek.gamerunner;

public class ZombieGame extends AbstractGame {
    //...

    public ZombieGame()
    {
        super("Escape from zombies");
    }

    public void start()
    {
        System.out.println("ZombieGame start");
    }

    public void play()
    {
        System.out.println("ZombieGame play");
    }

    public void pause()
    {
        System.out.println("ZombieGame pause");
    }
    //...
    public void end()
    {
        System.out.println("ZombieGame end");
    }
}
