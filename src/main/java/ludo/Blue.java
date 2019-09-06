package ludo;
import java.util.Arrays;

public class Blue extends Yard {
    public Blue() {
        this.coins = Arrays.asList(new Coin(),new Coin(), new Coin(), new Coin());
        this.color = "Blue";
        this.starting = 39;
        this.ending = 106;
    }

}
