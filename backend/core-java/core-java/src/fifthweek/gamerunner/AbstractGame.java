package fifthweek.gamerunner;

public abstract class AbstractGame {
    private String m_name;
    //...

    public AbstractGame(String name)
    {
        m_name = name;
    }


    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public abstract void start();
    public abstract void play();
    public abstract void pause();
    //...
    public abstract void end();

    //...
    public final void run()
    {
        this.start();
        this.play();
        //...
        this.pause();
        //...
        this.end();
    }
}
