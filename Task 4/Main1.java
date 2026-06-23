import java.util.List;

interface Shape{
    double area();
}

class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
   
class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return width * height;

    }
}


class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;

    }
    @Override
    public double area(){
        return 0.5 * base * height;
    }
}

class AreaCalculator{

    public double calculateTotalArea(List<Shape> shapes){
        double total = 0;
        for(Shape shape : shapes){
            total += shape.area();
        }
        return total;
    }
}



public class Main1 {
    public static void main(String[] args){
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

