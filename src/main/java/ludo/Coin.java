package ludo;

class Coin {
    private int position = -1;

    boolean isAtHome() {
        return position == -1;
    }

    void place(int startingPosition) {
        position = startingPosition;
    }

    int moveBy(int numberOnDice) {
        this.position += numberOnDice;
        return this.position;
    }

    int getPosition() {

        return position;
    }
}
