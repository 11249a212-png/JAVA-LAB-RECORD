# Experiment 5(a): Substring of a String

## Aim

To write a Java program to extract a substring from a given string using the `substring()` method.

## Algorithm

1. Start the program.
2. Declare and initialize a string.
3. Specify the starting and ending indices for the substring.
4. Use the `substring()` method to extract the required part of the string.
5. Display the original string and the extracted substring.
6. Stop the program.

## Source Code

```java
public class Exp5a_Substring {
    public static void main(String[] args) {

        String str = "Java Programming";

        // Extract a substring from index 5 to 16
        String sub = str.substring(5, 16);

        System.out.println("Original String: " + str);
        System.out.println("Substring: " + sub);
    }
}
```

## Result

Thus, the Java program to extract a substring from a string was executed successfully.

