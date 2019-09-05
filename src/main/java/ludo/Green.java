package ludo;

import java.util.Arrays;

public class Green extends Home{
    public Green() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());;
        this.color = "Green";
        this.starting = 13;
        this.ending = 69;
    }
}
