package ludo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    static private List<Yard> colors = new ArrayList<>();
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private int yellow = 0;
    private Yard home;
    private Dice dice;
    private int numberOfCoinsOut = -1;

    public Player(Yard home) {
        this.home = home;
        dice = new Dice();
    }

    private void moveACoin(int numberOnDice) {
        System.out.println("Which coin do you want to move?");
        Scanner scanner = new Scanner(System.in);
        int coinToMove = scanner.nextInt();
        home.coins.get(coinToMove).moveBy(numberOnDice);
    }

    private void moveACoinOut() {
        numberOfCoinsOut++;
        home.coins.get(numberOfCoinsOut).place(home.starting);
    }

    void play() {
        int numberOnDice = dice.toss();
        int numberOfCoinsAtHome = 0;
        for (Coin coin : home.coins) {
            if (coin.isAtHome()) {
                numberOfCoinsAtHome++;
            }
        }
        System.out.println("Player color "+home);
        System.out.println("NumberOnDice "+numberOnDice);
        System.out.println("New position "+ new Coin().getPosition());
        System.out.println("numberOfCoinsAtHome "+numberOfCoinsAtHome);
        System.out.println();
        if (numberOnDice == 6 && numberOfCoinsAtHome == 4) {
            moveACoinOut();
        }

        if (numberOnDice == 6 && numberOfCoinsAtHome == 0) {
            moveACoin(numberOnDice);
        }

        if (numberOnDice == 6 && numberOfCoinsAtHome != 4) {
            System.out.println("What do you want to do?");
            System.out.println("1. Move existing coin");
            System.out.println("2. Take out a coin");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                moveACoin(numberOnDice);
            } else {
                moveACoinOut();
            }
        }

        if (numberOfCoinsAtHome == 4 && numberOnDice == 6) {
            System.out.println("Which coin do you want to move?");
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        }

    }
}
