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

    }
}
