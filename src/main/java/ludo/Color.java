package ludo;

public enum Color {
    RED(0,56), GREEN(13,69), YELLOW(26,82), BLUE(39,106);
    private int startingPosition;
    private int endingPosition;

    Color(int startingPosition, int endingPosition) {
        this.startingPosition = startingPosition;
        this.endingPosition = endingPosition;
    }

    public int getEndingPosition() {
        return endingPosition;
    }

    public int getStartingPosition() {
        return startingPosition;
    }
}
