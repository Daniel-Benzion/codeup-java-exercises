package shapes;

import util.Input;

public class CircleApp {

    private static int circleCount;

    public static int getCircleCount() {
        return circleCount;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle;
        circleCount = 0;

        while(true){
            boolean confirm = input.yesNo("Do you want to print a circle?");
            if (confirm) {
                circle = new Circle(input.getDouble());
                System.out.println("Here's your circle!");
                System.out.println("Area of your circle: " + circle.getArea());
                System.out.println("Circumference of your circle: " + circle.getCircumference());
                circleCount++;
            } else {
                System.out.println("Total circles created: " + getCircleCount());
                break;
            }

        }

    }

}
