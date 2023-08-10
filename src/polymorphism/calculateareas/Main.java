package polymorphism.calculateareas;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Shape rectangle = new Rectangle(10, 5);
        double rectangleArea = shapeCalculator.calculateArea1(rectangle);
        System.out.println("Rectangle Area: " + rectangleArea);

        Shape circle = new Circle(10);
        double circleArea = shapeCalculator.calculateArea1(circle);
        System.out.println("Circle Area: " + circleArea);


        Shape triangle = new Triangle(6, 8, 10);
        double triangleArea = shapeCalculator.calculateArea1(triangle);
        System.out.println("Triangle Area: " + triangleArea);

    }
}

