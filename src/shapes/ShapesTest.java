package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        /*
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area: " + box1.getArea());
        System.out.println("Perimeter: " + box1.getPerimeter());


        Rectangle box2 = new Square(5);
        System.out.println("Area: " + box2.getArea());
        System.out.println("Perimeter: " + box2.getPerimeter());

         */

        Measurable myShape = new Rectangle(3.0, 5.0);

        System.out.println("It's a rectangle: ");

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("Now it's a square:");

        myShape = new Square(3.0);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }
}
