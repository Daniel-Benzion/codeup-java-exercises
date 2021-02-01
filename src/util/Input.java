package util;

import java.util.*;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string:");
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
            int input = Integer.parseInt(scanner.nextLine());
            if (input <= max && input >= min) {
                return input;
            }
        }
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max) {
        while (true) {
            System.out.println("Enter a number: ");
            double input = Double.parseDouble(scanner.nextLine());
            if (input <= max && input >= min) {
                return input;
            }
        }

    }

    public double getDouble() {
        System.out.println("Enter a decimal number:");
        return Double.parseDouble(scanner.nextLine());
    }
}
