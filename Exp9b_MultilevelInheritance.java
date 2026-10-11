## Aim

To write a Java program to demonstrate multilevel inheritance using classes.

## Algorithm

1. Start the program.
2. Create a class `Animal` with a method `eat()`.
3. Create a class `Dog` that extends `Animal` and defines a method `bark()`.
4. Create a class `Puppy` that extends `Dog` and defines a method `weep()`.
5. Create an object of the `Puppy` class.
6. Call the methods `eat()`, `bark()`, and `weep()`.
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

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Exp9b_MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}
```



## Result

Thus, the Java program demonstrating multilevel inheritance using classes was written and executed successfully.
