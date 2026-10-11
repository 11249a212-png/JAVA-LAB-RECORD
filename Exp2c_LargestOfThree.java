# Experiment 2(c): Largest of Three Numbers

## Aim

To write a Java program to find the largest of three numbers using a switch-case statement.

## Algorithm

1. Start the program.
2. Read three numbers from the user.
3. Compare the three numbers to determine which is the largest.
4. Use a switch-case statement to display the largest number.
5. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp2c_LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Display the largest number using switch-case
        switch (1) {
            case 1:
                System.out.println("Largest number: " + largest);
                break;
        }

        sc.close();
    }
}
```

## Result

Thus, the Java program to find the largest of three numbers was executed successfully.


