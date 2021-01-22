import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {


        int i = 5;

        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----");

        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);

        System.out.println("-----");

        i -= 2;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);

        System.out.println("-----");

        long j = 2;
        do {
            System.out.println(j);
            j *= j;
        } while (j < 1000000);

        System.out.println("-----");

        for (int ii = 100; ii >= -10; ii -= 5) {
            System.out.println(ii);
        }

        System.out.println("-----");

        for (long k = 2; k < 1_000_000; k *= k) {
            System.out.println(k);
        }

        System.out.println("-----");


        for (int jj = 1; jj <= 100; jj++) {

            if (jj % 3 == 0 && jj % 5 == 0) {

                System.out.println("FizzBuzz");

            } else if (jj % 3 == 0) {

                System.out.println("Fizz");

            } else if (jj % 5 == 0) {

                System.out.println("Buzz");

            } else {

                System.out.println(jj);
            }
        }

        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");
        System.out.println("-----");

        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to go up to? ");

        int userInt = scanner.nextInt();

        System.out.println("Here is your table: ");
        System.out.println("/n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int kk = 1; kk < userInt; kk++) {
            System.out.printf("%d\t   | %d\t\t | %d%n", kk, (kk * kk), (kk * kk * kk));
        }



        System.out.print("Enter your number grade, 0 - 100: ");
        userInt = scanner.nextInt();

        System.out.print("Your letter grade is: ");
        if (userInt > 87) {
            System.out.println("A");
        } else if (userInt > 79) {
            System.out.println("B");
        } else if (userInt > 66) {
            System.out.println("C");
        } else if (userInt > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
