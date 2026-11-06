# Experiment: File Writer in Java

## Aim
To write and execute a Java program to write data into a file using the FileWriter class.

## Algorithm
1. Start the program.
2. Import the `java.io` package.
3. Create a FileWriter object to open or create a file.
4. Write the required text into the file using the `write()` method.
5. Close the file using the `close()` method.
6. Display a success message.
7. Stop the program.

## Program

**File Name: FileWriterExample.java**

```java
import java.io.*;

class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");

            fw.write("Welcome to Java Programming.\n");
            fw.write("This is an example of FileWriter.\n");
            fw.write("Writing data into a file using Java.");

            fw.close();

            System.out.println("Data written successfully.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

## Sample Output

```text
Data written successfully.
```

## Output File

**File Name: output.txt**

```text
Welcome to Java Programming.
This is an example of FileWriter.
Writing data into a file using Java.
```

## Result
Thus, the Java program to write data into a file using the FileWriter class was successfully executed.
