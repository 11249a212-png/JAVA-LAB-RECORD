## Aim

To write a Java program to demonstrate hierarchical inheritance using classes.

## Algorithm

1. Start the program.
2. Create a parent class `Animal` with a method `eat()`.
3. Create a child class `Dog` that extends `Animal` and defines a method `bark()`.
4. Create another child class `Cat` that extends `Animal` and defines a method `meow()`.
5. Create objects of the `Dog` and `Cat` classes.
6. Call the inherited `eat()` method and each child's own method.
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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Exp9c_HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
```



## Result

Thus, the Java program demonstrating hierarchical inheritance using classes was written and executed successfully.
