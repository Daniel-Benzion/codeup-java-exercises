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

    public static void main(String[] args) {
        add(800, 17);
        subtract(800, 17);
        multiply(800, 17);
        divide(800, 17);
        divide(800, 0);
        mod(800, 17);
    }
}
