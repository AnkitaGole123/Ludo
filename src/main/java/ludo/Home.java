package ludo;

import java.util.List;

public class Home {
    private List<Coin> coins;
    private String color;
    private int starting;
    private int ending;

    public Home(List<Coin> coins, String color, int starting, int ending) {
        this.coins = coins;
        this.color = color;
        this.starting = starting;
        this.ending = ending;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public String getColor() {
        return color;
    }

    public int getStarting() {
        return starting;
    }

    public int getEnding() {
        return ending;
    }
}
