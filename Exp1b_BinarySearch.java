# Experiment 1(b): Binary Search

## Aim

To write a Java program to search for an element in a sorted array using the binary search technique.

## Algorithm

1. Start the program.
2. Declare a sorted integer array and the element to be searched.
3. Initialize `low = 0` and `high = arr.length - 1`.
4. Calculate the middle index using `mid = (low + high) / 2`.
5. If the middle element equals the search element, display its position and stop.
6. If the search element is greater than the middle element, set `low = mid + 1`.
7. Otherwise, set `high = mid - 1`.
8. Repeat until the element is found or `low > high`.
9. If the element is not found, display an appropriate message.
10. Stop the program.

## Source Code

```java
public class Exp1b_BinarySearch {
    public static void main(String[] args) {

        // Sorted array
        int[] arr = {10, 20, 30, 40, 50};

        // Element to search
        int key = 30;

        int low = 0;
        int high = arr.length - 1;
        int position = -1;

        // Binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                position = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Display result
        if (position != -1) {
            System.out.println(
                "Element found at position: " + (position + 1)
            );
        } else {
            System.out.println("Element not found");
        }
    }
}
```

## Result

Thus, the Java program to search for an element using binary search was executed successfully.
