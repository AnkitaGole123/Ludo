package ludo;

import java.util.List;
import java.util.Scanner;

 class Player {
    private List<Coin> coins;
    private Yard yard;
    private Dice dice;
    private int numberOfCoinsOut = -1;
    private Scanner scan = new Scanner(System.in);

    Player(Yard home) {
        this.yard = home;
        dice = new Dice();
        this.coins = yard.coins;
    }

    private void moveACoin(int coinToMove, int numberOnDice) {
        int i = numberOnDice + coins.get(coinToMove).getPosition();
        if (i > yard.ending) {
            System.out.println("not move");
        } else {
            int position = coins.get(coinToMove).moveBy(numberOnDice);
            System.out.println(position);
            if (position == yard.ending) {
                Game.addYard(yard);
            }
        }
    }

    private void moveACoinOut() {
        numberOfCoinsOut++;
        yard.coins.get(numberOfCoinsOut).place(yard.starting);
    }

    void play() {
        int numberOnDice = dice.toss();
        int numberOfCoinsAtHome = getNumberOfCoinsInHome();
        printer(numberOnDice, numberOfCoinsAtHome);

        if (numberOnDice == 6 && numberOfCoinsAtHome == 4) {
            moveACoinOut();
        }

        if (numberOnDice == 6 && numberOfCoinsAtHome == 0) {
            int moveCoin = takingUserInput();
            moveACoin(moveCoin, numberOnDice);
        }

        if (numberOnDice == 6 && numberOfCoinsAtHome != 4) {
            System.out.println("What do you want to do?");
            System.out.println("1. Move existing coin");
            System.out.println("2. Take out a coin");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                int coinMove = takingUserInput();
                moveACoin(coinMove, numberOnDice);
            } else {
                moveACoinOut();
            }
        } else if (numberOfCoinsAtHome != 4) {
            int moveCoin = takingUserInput();
            moveACoin(moveCoin, numberOnDice);
        }

    }
    private int getNumberOfCoinsInHome() {
        int numberOfCoinsAtHome = 0;
        for (Coin coin : this.coins) {
            if (coin.isAtHome()) {
                numberOfCoinsAtHome++;
            }
        }
        return numberOfCoinsAtHome;
    }


    private int takingUserInput() {
        System.out.println("Which coin do you want to move?");
        return scan.nextInt();
    }

    private void printer(int numberOnDice, int numberOfCoinsAtHome) {
        System.out.println("Color " + yard.color +
                " Number On Dice " + numberOnDice +
                " number Of Coins At Home " + numberOfCoinsAtHome);
    }
}
