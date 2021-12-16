package example.platform;

import example.games.AbstractGame;
import example.games.stderr.StderrGameA;
import example.games.stderr.StderrGameB;
import example.games.stderr.StderrGameC;
import example.games.stderr.StderrGameD;
import example.games.stderr.StderrGameE;

import java.util.List;

public class StderrGamesFactory extends AbstractGamesFactory {
    @Override
    public List<AbstractGame> getGames() {
        return List.of(
                new StderrGameA(),
                new StderrGameB(),
                new StderrGameC(),
                new StderrGameD(),
                new StderrGameE()
        );
    }
}
