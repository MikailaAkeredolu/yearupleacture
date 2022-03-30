package dwonwithoop;

public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        square.setSide(20);


        Circle circle = new Circle();
        circle.setSide(7);

        Rectangle rectangle = new Rectangle();
        rectangle.setSide(2);
        rectangle.setLength(4);

        Shape[] shapes = {square, circle, rectangle };

        for (Shape shape : shapes) {
               shape.calcArea();
        }





    }
}
