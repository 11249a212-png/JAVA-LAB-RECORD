
package Exp6b;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(5);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());

        System.out.println("\nSquare:");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}
