package fifthweek.gamerunner;

public class ShuffleDeckGame extends AbstractGame {
    private Card[] m_deck;

    public ShuffleDeckGame()
    {
        super("Shuffle Deck");
    }

    public void start()
    {
        m_deck = Card.getShuffledDeck();
    }
    public void play()
    {
        for (Card card : m_deck)
            System.out.println(card);
    }

    public void pause()
    {
        System.out.println("Shuffle Deck pause");
    }
    //...
    public void end()
    {
        System.out.println("Shuffle Deck end");
    }
}