package ludo;

import java.util.Arrays;

public class Yellow extends Home{
    public Yellow() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());;
        this.color = "Yellow";
        this.starting = 26;
        this.ending = 82;
    }
}
