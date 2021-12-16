package example.platform;

import example.games.AbstractGame;

import java.util.List;

public abstract class AbstractGamesFactory {
    public abstract List<AbstractGame> getGames();
}
