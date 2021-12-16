package example.games.stderr;

import example.games.AbstractGame;

public class StderrGameA extends AbstractGame {

    public void run() {
        System.err.println("This is game A, enjoy");
    }
}
