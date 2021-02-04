package shapes;

public class Square extends Quadrilateral implements Measurable {

    /*
    private final int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }

     */

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.setLength(side);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
