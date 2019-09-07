package ludo;

import java.util.Arrays;

public class GreenYard extends Yard {
    public GreenYard() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());;
        this.color = "GreenYard";
        this.starting = 13;
        this.ending = 69;
    }
}
