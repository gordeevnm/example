package example.platform;

import example.games.AbstractGame;
import example.games.stdout.StdoutGameA;
import example.games.stdout.StdoutGameB;
import example.games.stdout.StdoutGameC;
import example.games.stdout.StdoutGameD;

import java.util.List;

public class StdoutGamesFactory extends AbstractGamesFactory {
    @Override
    public List<AbstractGame> getGames() {
        return List.of(
                new StdoutGameA(),
                new StdoutGameB(),
                new StdoutGameC(),
                new StdoutGameD()
        );
    }
}
