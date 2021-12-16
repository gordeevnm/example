package example.games;

public abstract class AbstractGame {
    public String getName() {
        return getClass().getSimpleName();
    }

    public String getRules() {
        return "some rules";
    }

    public abstract void run();
}
