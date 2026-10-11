## Aim

To write a Java program to demonstrate multiple inheritance using interfaces.

## Algorithm

1. Start the program.
2. Create an interface `Printable` with a method `print()`.
3. Create another interface `Showable` with a method `show()`.
4. Create a class `Demo` that implements both interfaces.
5. Define the `print()` and `show()` methods in the `Demo` class.
6. Create an object of the `Demo` class.
7. Call both methods and display the output.
8. Stop the program.

## Program

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class Exp10a_MultipleInheritance
        implements Printable, Showable {

    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        Exp10a_MultipleInheritance obj =
                new Exp10a_MultipleInheritance();

        obj.print();
        obj.show();
    }
}
```



## Result

Thus, the Java program demonstrating multiple inheritance using interfaces was written and executed successfully.
