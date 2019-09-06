package ludo;

import java.util.Arrays;

public class Red extends Yard {
    public Red() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());;
        this.color = "Red";
        this.starting = 0;
        this.ending = 56;
    }
}
