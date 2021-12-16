package example;

import example.games.AbstractGame;
import example.platform.AbstractGamesFactory;
import example.platform.StderrGamesFactory;
import example.platform.StdoutGamesFactory;

import java.util.List;
import java.util.Scanner;

/**
 * http://codelab.ru/data/tasks/200/Image/structure.gif
 * AbstractFactory == AbstractGamesFactory
 *
 * ConcreteFactory1 == StderrGamesFactory
 * ConcreteFactory2 == StdoutGamesFactory
 *
 * AbstractProductA == AbstractGame
 *
 * ProductA1 == StderrGameA, StderrGameB, StderrGameC, StderrGameD, StderrGameE
 *
 * ProductA2 == StdoutGameA, StdoutGameB, StdoutGameC, StdoutGameD
 */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Select platform(stdout|stderr)");
        final String platform = scanner.nextLine();

        final AbstractGamesFactory gamesFactory;
        if ("stderr".equals(platform)) {
            gamesFactory = new StderrGamesFactory();
        } else {
            gamesFactory = new StdoutGamesFactory();
        }

        ///// ||||        ||||
        ///// vvvv Client vvvv

        final List<AbstractGame> games = gamesFactory.getGames();

        System.out.println("Select game:");
        for (int i = 0; i < games.size(); i++) {
            final AbstractGame game = games.get(i);
            System.out.printf(
                    "%d - %s: %s%n",
                    i,
                    game.getName(),
                    game.getRules()
            );
        }

        final int selectedGame = scanner.nextInt();
        final AbstractGame game = games.get(selectedGame);

        game.run();
    }
}
