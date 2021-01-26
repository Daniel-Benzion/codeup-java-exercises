import java.util.*;

public class HighLow {

    public static void guessingGame() {
        int selectedNumber = (int) ((Math.random() * (100 - 1)) + 1);
        Scanner scanner = new Scanner(System.in);
        int guessCount = 1;
        System.out.println("Let's play a guessing game! I have picked a random number between 1 and 100 (inclusive) Let's see if you can guess it!");
        while (true) {
            System.out.println("Enter a number guess:");
            int userGuess = Integer.parseInt(scanner.nextLine());
            if (userGuess == selectedNumber) {
                System.out.println("GOOD GUESS!");
                if (guessCount == 1) System.out.println("You found the number in one try! Great job!");
                System.out.println("You found the number in " + guessCount + " tries!");
                break;
            } else if (userGuess < selectedNumber) {
                System.out.println("HIGHER");
                guessCount++;
            } else {
                System.out.println("LOWER");
                guessCount++;
            }
        }


    }

    public static void main(String[] args) {
        guessingGame();
    }
}
