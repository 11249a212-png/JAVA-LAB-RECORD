# Experiment 4(d): Perfect Number

## Aim

To write a Java program to check whether a given number is a perfect number or not.

## Algorithm

1. Start the program.
2. Read a number from the user.
3. Initialize the sum to zero.
4. Find all proper divisors of the number using a loop from 1 to `num / 2`.
5. If a number divides the given number exactly, add it to the sum.
6. Compare the sum with the original number.
7. If both are equal and the number is positive, print that it is a perfect number; otherwise, print that it is not.
8. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp4d_PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find and add the proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check whether the number is perfect
        if (num > 0 && sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }

        sc.close();
    }
}
```

## Result

Thus, the Java program to check whether a number is a perfect number was executed successfully.

