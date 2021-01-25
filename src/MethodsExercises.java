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

    public static void main(String[] args) {
        add(800, 17);
        subtract(800, 17);
        multiply(800, 17);
        divide(800, 17);
        divide(800, 0);
        mod(800, 17);
        getInteger(4, 16);
    }
}
