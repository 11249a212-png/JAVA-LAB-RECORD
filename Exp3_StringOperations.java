# Experiment 3: String Operations

## Aim

To write a Java program to perform various string operations such as finding the length, concatenating strings, comparing strings, and converting a string to uppercase and lowercase.

## Algorithm

1. Start the program.
2. Declare and initialize two strings.
3. Find and display the length of the first string.
4. Concatenate the two strings and display the result.
5. Compare the two strings and display whether they are equal.
6. Convert the first string to uppercase and lowercase.
7. Display all the results.
8. Stop the program.

## Source Code

```java
public class Exp3_StringOperations {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Java";

        // Find the length of the string
        System.out.println("Length of str1: " + str1.length());

        // Concatenate two strings
        System.out.println("Concatenation: " + str1.concat(str2));

        // Compare two strings
        System.out.println("Are strings equal? " + str1.equals(str2));

        // Convert to uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // Display a character at a specific index
        System.out.println("Character at index 1: " + str1.charAt(1));
    }
}
```

## Result

Thus, the Java program to perform various string operations was executed successfully.

