# Experiment 1(c): Finding the Largest and Smallest Number in an Array

## Aim

To write a Java program to find the largest and smallest elements in an array.

## Algorithm

1. Start the program.
2. Declare and initialize an integer array.
3. Assume the first element is both the largest and smallest.
4. Traverse the remaining array elements using a loop.
5. If an element is greater than the largest, update the largest value.
6. If an element is smaller than the smallest, update the smallest value.
7. Display the largest and smallest elements.
8. Stop the program.

## Source Code

```java
public class Exp1c_LargestSmallest {
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {25, 10, 45, 5, 30, 50, 15};

        // Assume the first element is largest and smallest
        int largest = arr[0];
        int smallest = arr[0];

        // Find the largest and smallest elements
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Display the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}

## Result

Thus, the Java program to find the largest and smallest numbers in an array was executed successfully.



