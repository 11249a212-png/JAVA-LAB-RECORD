# Experiment 1(d): To Print Marks Above Sixty

## Aim

To write a Java program to print the marks that are above 60 from a given array of marks.

## Algorithm

1. Start the program.
2. Declare and initialize an integer array containing marks.
3. Traverse the array using a `for` loop.
4. Check whether each mark is greater than 60.
5. If the condition is true, print that mark.
6. Stop the program.

## Source Code

```java
public class Exp1d_MarksAboveSixty {
    public static void main(String[] args) {

        // Array containing student marks
        int[] marks = {45, 75, 60, 85, 55, 92, 68, 40};

        System.out.println("Marks above 60:");

        // Check and print marks above 60
        for (int mark : marks) {
            if (mark > 60) {
                System.out.println(mark);
            }
        }
    }
}


## Result

Thus, the Java program to print marks above 60 was executed successfully.



