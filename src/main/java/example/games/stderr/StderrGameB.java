package example.games.stderr;

import example.games.AbstractGame;

public class StderrGameB extends AbstractGame {
    public void run() {
        System.err.println("This is game B, good luck");
    }
}
