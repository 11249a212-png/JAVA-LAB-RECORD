# Experiment 5(b): Replacing a Substring

## Aim

To write a Java program to replace a substring in a given string using the `replace()` method.

## Algorithm

1. Start the program.
2. Declare and initialize a string.
3. Specify the substring to be replaced and the new substring.
4. Use the `replace()` method to replace the old substring with the new substring.
5. Display the original string and the modified string.
6. Stop the program.

## Source Code

```java
public class Exp5b_ReplaceSubstring {
    public static void main(String[] args) {

        String str = "Java is easy to learn";

        // Replace the substring "easy" with "powerful"
        String result = str.replace("easy", "powerful");

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
    }
}
```

## Result

Thus, the Java program to replace a substring in a given string was executed successfully.

