
package Exp6a;

public class ArithmeticDemo {
    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + obj.add(a, b));
        System.out.println("Subtraction: " + obj.subtract(a, b));
        System.out.println("Multiplication: " + obj.multiply(a, b));
        System.out.println("Division: " + obj.divide(a, b));
    }
}
