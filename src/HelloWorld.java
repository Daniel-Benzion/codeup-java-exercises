public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        int myFavoriteNumber = 80;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string";
        System.out.println(myString);

        //myString = 'c';
        //myString = 3.14159;
        //long myNumber;
        //myNumber = 3.14;
        //myNumber = 123L;
        //myNumber = 123;
        //float myNumber = 3.14;
        //myNumber = (float) 3.14;

        /*
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
         */

        /*
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
         */

        //int class = 18;

        /*
        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
         */

        //int three = (int) "three";

        //int x = 4;
        //x += 5;

        //int x = 3;
        //int y = 4;
        //y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

        int z = Integer.MAX_VALUE;
        System.out.println(++z);
    }
}
