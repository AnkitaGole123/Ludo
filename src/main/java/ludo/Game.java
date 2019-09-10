package ludo;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private int currentPlayerIndex;
    static private List<Yard> colors = new ArrayList<>();
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private int yellow = 0;

    Game(List<Player> players) {
        this.players = players;
        this.currentPlayerIndex = 0;
    }

    boolean isRunning() {
        return !winnerChecker();
    }
    static void addYard(Yard yard){
        colors.add(yard);
    }

    void play() {
        Player currentPlayer = players.get(currentPlayerIndex);
        currentPlayer.play();
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

   private boolean winnerChecker() {
        String winner = coinsCounter();
        int neededCoinForWin = 1;
        boolean red = this.red == neededCoinForWin;
        boolean green = this.green == neededCoinForWin;
        boolean blue = this.blue == neededCoinForWin;
        boolean yellow = this.yellow == neededCoinForWin;
        if (red || green || blue || yellow) {
            System.out.println(winner);
            return true;
        }
        return false;
    }

    private String coinsCounter() {
        for (Yard yard : colors) {
            switch (yard.color) {
                case "Red":
                    this.red += 1;
                    break;
                case "Green":
                    this.green += 1;
                    break;
                case "Blue":
                    this.blue += 1;
                    break;
                case "Yellow":
                    this.yellow += 1;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + yard.color);
            }
            return yard.color;
        }
        return null;
    }
    }

