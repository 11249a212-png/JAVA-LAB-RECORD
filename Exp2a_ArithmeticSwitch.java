# Experiment 2(a): Arithmetic Operations Using Switch Case

## Aim

To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, and division using a switch-case statement.

## Algorithm

1. Start the program.
2. Declare two numbers and an arithmetic operator.
3. Use a switch-case statement to select the operation.
4. Perform addition, subtraction, multiplication, or division based on the operator.
5. Check for division by zero before performing division.
6. Display the result of the selected operation.
7. Display an error message if the operator is invalid.
8. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp2a_ArithmeticSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        sc.close();
    }
}
```

## Result

Thus, the Java program to perform arithmetic operations using a switch-case statement was executed successfully.


