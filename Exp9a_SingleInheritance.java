# Experiment 9(a): Single Inheritance Using Classes

## Aim

To write a Java program to demonstrate single inheritance using classes.

## Algorithm

1. Start the program.
2. Create a parent class named `Animal` with a method `eat()`.
3. Create a child class named `Dog` that extends the `Animal` class.
4. Define a method `bark()` in the child class.
5. Create an object of the `Dog` class in the main method.
6. Call the inherited `eat()` method and the child class's `bark()` method.
7. Display the output.
8. Stop the program.

## Program

```java
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Exp9a_SingleInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
```



## Result

Thus, the Java program demonstrating single inheritance using classes was written and executed successfully.
