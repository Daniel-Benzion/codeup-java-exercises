import java.util.*;

public class MethodsExercises {

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("You can't divide by zero!");
        } else {
            System.out.println(num1 * 1.0 / num2);
        }
    }

    public static void mod(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("You can't divide by zero!");
        } else {
            System.out.println(num1 % num2);
        }
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int input = Integer.parseInt(scanner.nextLine());

        if (input < min || input > max) {
            System.out.printf("%d is not a valid number%n", input);
            return getInteger(min, max);
        } else {
            System.out.println("You entered a valid number!");
            return input;
        }
    }

    public static void factorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        long input = Long.parseLong(scanner.nextLine());

        System.out.printf("You entered %d. Do you wish to see the factorial? Y/N%n", input);
        String conf = scanner.nextLine();
        if (conf.equalsIgnoreCase("y")) {
            System.out.printf("%d x", input);
            for (long i = input - 1; i > 1; i--) {
                System.out.printf(" %d x", i);
                input *= i;
            }
            System.out.printf(" 1 = %d", input);
        }
    }

    public static void diceGame() {
        System.out.println("How many sides on your dice?\n");
        Scanner scanner = new Scanner(System.in);
        int sides = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.println("Please roll the dice by typing \"roll\". You may quit the game by typing \"quit\".\n");
            String rollQuit = scanner.nextLine();
            if (rollQuit.equalsIgnoreCase("quit")) {
                System.out.println("Bye for now!");
                break;
            } else if (rollQuit.equalsIgnoreCase("roll")) {
                int die1 = rollDice(1, sides);
                int die2 = rollDice(1, sides);
                System.out.printf("You rolled a %d and a %d, for a total of: %d%n", die1, die2, die1+die2);
                System.out.println("Would you like to roll again? y/n");
                String afterRollQuit = scanner.nextLine();
                if (afterRollQuit.equalsIgnoreCase("n")) {
                    System.out.println("Bye for now!");
                    break;
                }
            }
        }

    }

    public static int rollDice(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        /*
        add(800, 17);
        subtract(800, 17);
        multiply(800, 17);
        divide(800, 17);
        divide(800, 0);
        mod(800, 17);
        getInteger(4, 16);
        factorial(1, 20);

         */
        diceGame();
    }
}
