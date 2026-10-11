## Aim

To write a Java program to demonstrate hybrid inheritance using interfaces in Java.

## Algorithm

1. Start the program.
2. Create an interface `Animal` with a method `eat()`.
3. Create an interface `Pet` that extends `Animal` and declares a method `play()`.
4. Create a class `Dog` that implements the `Pet` interface.
5. Define the `eat()` and `play()` methods in the `Dog` class.
6. Create an object of the `Dog` class.
7. Call both methods and display the output.
8. Stop the program.

## Program

```java
interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Exp10b_HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.play();
    }
}
```



## Result

Thus, the Java program demonstrating hybrid inheritance using interfaces was written and executed successfully.
