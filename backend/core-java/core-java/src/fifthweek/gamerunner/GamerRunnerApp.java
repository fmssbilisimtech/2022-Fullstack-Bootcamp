package fifthweek.gamerunner;

public class GamerRunnerApp {
    private final GameController m_gameController;

    private void initGames()
    {
        m_gameController.add(new CarRaceGame());
        m_gameController.add(new ZombieGame());
        m_gameController.add(new AngryBirdsGame());
        m_gameController.add(new ShuffleDeckGame());
        m_gameController.add(new RandomCardGame());
    }

    public GamerRunnerApp()
    {
        m_gameController = new GameController();
        this.initGames();
    }

    public void run()
    {
        m_gameController.run();
    }
}
