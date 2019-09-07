package ludo;
import java.util.Arrays;

public class BlueYard extends Yard {
    public BlueYard() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());
        this.color = "BlueYard";
        this.starting = 39;
        this.ending = 106;
    }

}
