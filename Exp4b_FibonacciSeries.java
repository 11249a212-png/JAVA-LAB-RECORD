# Experiment 4(b): Fibonacci Series

## Aim

To write a Java program to generate the Fibonacci series for a given number of terms.

## Algorithm

1. Start the program.
2. Read the number of terms from the user.
3. Initialize the first two Fibonacci numbers as 0 and 1.
4. Display the Fibonacci numbers using a loop.
5. Calculate each next term by adding the previous two terms.
6. Update the previous two terms after each iteration.
7. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp4b_FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
```

## Result

Thus, the Java program to generate the Fibonacci series was executed successfully.

