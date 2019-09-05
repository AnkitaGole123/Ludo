package ludo;

import java.util.List;

public class Game {
    private List<Player> players;
    private int currentPlayerIndex;

    Game(List<Player> players) {
        this.players = players;
        this.currentPlayerIndex = 0;
    }

    boolean isRunning() {
        return true;
    }

    void play() {
        Player currentPlayer = players.get(currentPlayerIndex);
        currentPlayer.play();
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
