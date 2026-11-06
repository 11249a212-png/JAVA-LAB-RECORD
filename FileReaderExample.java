# Experiment: File Reader in Java

## Aim
To write and execute a Java program to read the contents of a file using the FileReader class.

## Algorithm
1. Start the program.
2. Import the `java.io` package.
3. Create a FileReader object to open the specified file.
4. Read the file character by character using a while loop.
5. Display the contents on the console.
6. Close the file.
7. Stop the program.

## Program

**File Name: FileReaderExample.java**

```java
import java.io.*;

class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

**Input File Name: sample.txt**

```text
Welcome to Java Programming.
This is an example of FileReader.
Reading a file using Java.
```

## Sample Output

```text
Welcome to Java Programming.
This is an example of FileReader.
Reading a file using Java.
```

## Result
Thus, the Java program to read the contents of a file using the FileReader class was successfully executed.
