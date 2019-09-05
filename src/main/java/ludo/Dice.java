package ludo;

import java.util.Random;

class Dice {
    int toss() {
        return new Random().nextInt(6)+1;
    }
}
