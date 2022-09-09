package fifthweek.gamerunner;

import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    private final ArrayList m_games = new ArrayList();
    //...
    private AbstractGame getGameByOption(int option)
    {
        return (AbstractGame)m_games.get(option);
    }

    public void displayMenu()
    {
        int size = m_games.size();

        System.out.println("Oyunlar:");
        for (int i = 0; i < size; ++i)
            System.out.printf("%d.%s%n", i + 1, ((AbstractGame) m_games.get(i)).getName());

        System.out.printf("%d.Çıkış%n", size + 1);
        System.out.print("Oyun numarasını giriniz:");
    }

    public void run()
    {
        Scanner kb = new Scanner(System.in);

        int sizep1 = m_games.size() + 1;

        for (;;) {
            this.displayMenu();
            int option = Integer.parseInt(kb.nextLine());

            if (option < 0 || option > sizep1) {
                System.out.println("Geçersiz seçenek");
                continue;
            }
            if (option == sizep1)
                break;

            AbstractGame abstractGame = getGameByOption(option - 1);

            abstractGame.run();
            System.out.println("/////////////////////");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }

    public void add(AbstractGame abstractGame)
    {
        //...
        m_games.add(abstractGame);
    }
}
