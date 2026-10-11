# Experiment 4(c): Multiplication Table

## Aim

To write a Java program to print the multiplication table of a given number.

## Algorithm

1. Start the program.
2. Read a number from the user.
3. Use a `for` loop from 1 to 10.
4. Multiply the given number by each loop value.
5. Display the multiplication table.
6. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp4c_MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
```

## Result

Thus, the Java program to print the multiplication table of a given number was executed successfully.

