package ludo;

import java.util.Arrays;

public class YellowYard extends Yard {
    public YellowYard() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());;
        this.color = "YellowYard";
        this.starting = 26;
        this.ending = 82;
    }
}
