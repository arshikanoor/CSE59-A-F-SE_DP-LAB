import java.util.List;

// 1. Shape interface (abstraction)
interface Shape {
    double area();
}

// 2. Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// 3. Rectangle class
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// 4. Triangle class (new shape added without modifying calculator)
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// 5. AreaCalculator (closed for modification, open for extension via Shape)
class AreaCalculator {

    public double calculateTotalArea(List<Shape> shapes) {
        double total = 0;

        for (Shape shape : shapes) {
            total += shape.area();
        }

        return total;
    }
}

// 6. Main class to run the program
public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8)
        );

        AreaCalculator calculator = new AreaCalculator();

        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Total Area: " + totalArea);
    }
}
