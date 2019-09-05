package ludo;

class Coin {
    private int position = -1;

    boolean isAtHome() {
        return position == -1;
    }

    void place(int startingPosition) {
        position = startingPosition;
    }

    void moveBy(int numberOnDice) {
        this.position += numberOnDice;
        System.out.println(this.position);
    }

    int getPosition() {
        return position;
    }
}
