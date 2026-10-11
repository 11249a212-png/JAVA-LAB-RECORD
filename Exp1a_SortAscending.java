# Experiment 1(a): Sort in Ascending Order

## Aim

To write a Java program to sort the given array of integers in ascending order.

## Algorithm

1. Start the program.
2. Declare and initialize an integer array.
3. Use two nested `for` loops to compare the array elements.
4. If the current element is greater than the next element, swap them.
5. Repeat until all elements are arranged in ascending order.
6. Display the sorted array.
7. Stop the program.

## Source Code

```java
import java.util.Arrays;

public class Exp1a_SortAscending {
    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Display the sorted array
        System.out.println("Array in ascending order:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

## Result

Thus, the Java program to sort the given array in ascending order was executed successfully.


```
