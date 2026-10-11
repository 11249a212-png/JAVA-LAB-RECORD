# Experiment 2(d): Leap Year

## Aim

To write a Java program to check whether a given year is a leap year or not.

## Algorithm

1. Start the program.
2. Read a year from the user.
3. Check whether the year is divisible by 400.
4. If not, check whether the year is divisible by 100.
5. If not, check whether the year is divisible by 4.
6. If the year is divisible by 400, or divisible by 4 but not by 100, it is a leap year.
7. Otherwise, it is not a leap year.
8. Display the result.
9. Stop the program.

## Source Code

```java
import java.util.Scanner;

public class Exp2d_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        sc.close();
    }
}
```

## Result

Thus, the Java program to check whether a given year is a leap year or not was executed successfully.

