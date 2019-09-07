package ludo;

import java.util.Arrays;

public class RedYard extends Yard {
    public RedYard() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());;
        this.color = "RedYard";
        this.starting = 0;
        this.ending = 56;
    }
}
