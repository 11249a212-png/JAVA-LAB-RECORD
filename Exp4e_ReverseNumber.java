# Experiment 4(e): Reverse of a Number

## Aim

To write a Java program to reverse a given integer.

## Algorithm

1. Start the program.
2. Read an integer from the user.
3. Initialize `reverse` to zero.
4. Extract the last digit using the modulus operator `% 10`.
5. Multiply `reverse` by 10 and add the extracted digit.
6. Remove the last digit using integer division by 10.
7. Repeat steps 4–6 until the number becomes zero.
8. Display the reversed number.
9. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp4e_ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int reverse = 0;

        // Reverse the number
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        // Display the reversed number
        if (num < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
```

## Result

Thus, the Java program to reverse a given integer was executed successfully.

