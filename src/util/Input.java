package util;

import java.util.*;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        System.out.println("Yes or no?");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        while (true) {
            System.out.println("Enter a number: ");
            try {
                int input = Integer.parseInt(getString());
                if (input <= max && input >= min) {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid number. Please try again.");
            }
        }
    }

    public String nextLine() {
        return scanner.nextLine();
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max) {
        while (true) {
            System.out.println("Enter a decimal number: ");
            try {
                double input = Double.parseDouble(getString());
                if (input <= max && input >= min) {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid number. Please try again.");
            }
        }
    }

    public double getDouble() {
        System.out.println("Enter a decimal number:");
        return Double.parseDouble(scanner.nextLine());
    }
}
