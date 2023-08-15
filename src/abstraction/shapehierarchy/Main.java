package abstraction.shapehierarchy;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Circle("Circle", 5);

        double circleArea = shape.calculateArea();
        System.out.println("Circle Area: " + circleArea);

        double circlePerimeter = shape.calculatePerimeter();
        System.out.println("Circle Perimeter: " + circlePerimeter);

        Shape shape1 = new Rectangle("Rectangle", 7, 5);

        double rectangleArea = shape1.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);

        double rectanglePerimeter = shape1.calculatePerimeter();
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
    }
}
