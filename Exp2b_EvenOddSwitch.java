# Experiment 2(b): Even or Odd Using Switch Case

## Aim

To write a Java program to check whether a given integer is even or odd using a switch-case statement.

## Algorithm

1. Start the program.
2. Read an integer from the user.
3. Calculate the remainder when the integer is divided by 2.
4. Use a switch-case statement on the remainder.
5. If the remainder is 0, print that the number is even.
6. If the remainder is 1 or -1, print that the number is odd.
7. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp2b_EvenOddSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is Even");
                break;

            case 1:
            case -1:
                System.out.println(num + " is Odd");
                break;
        }

        sc.close();
    }
}
```

## Result

Thus, the Java program to check whether a number is even or odd using a switch-case statement was executed successfully.


