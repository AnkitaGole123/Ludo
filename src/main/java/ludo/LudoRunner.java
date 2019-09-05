package ludo;

import java.util.Arrays;
import java.util.List;

public class LudoRunner {
    public static void main(String[] args) {

        List<Player> players = Arrays.asList(new Player(new Blue()), new Player(new Red()));
        Game game = new Game(players);
        while (game.isRunning()) {
            game.play();
        }
    }
}
