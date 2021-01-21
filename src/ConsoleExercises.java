import java.sql.SQLOutput;
import java.util.*;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer, please: ");
        int userInt = scanner.nextInt();
        System.out.printf("The integer you entered is: %d %n", userInt);
        System.out.printf("The integer you entered times two is: %d %n", userInt * 2);

        System.out.print("Please enter three words: ");
        String uStr1 = scanner.next();
        String uStr2 = scanner.next();
        String uStr3 = scanner.next();
        System.out.printf("Your words are: %n %s %n %s %n %s %n", uStr1, uStr2, uStr3);

        scanner.nextLine();
        System.out.print("Please enter a full sentence: ");
        String uSent = scanner.nextLine();
        System.out.printf("Your sentence is: %n %s %n", uSent);

        System.out.print("Enter the length and width of your classroom, separated by a space: ");
        scanner.useDelimiter("\\s");
        int cLen = scanner.nextInt();
        int cWid = scanner.nextInt();
        System.out.printf("The area of your classroom is: %d %n", cLen * cWid);
    }
}
