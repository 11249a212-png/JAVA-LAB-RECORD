# Experiment 7: Multithreading in Java

## Aim

To write a Java program to implement multithreading by creating two threads using the `Thread` class.

## Algorithm

1. Start the program.
2. Create a class `MyThread` that extends the `Thread` class.
3. Override the `run()` method to print numbers from 1 to 5.
4. Use `Thread.sleep(500)` to pause execution for 500 milliseconds.
5. Create two thread objects in the main class.
6. Assign names to the threads as `Thread 1` and `Thread 2`.
7. Start both threads using the `start()` method.
8. Observe the concurrent execution of both threads.
9. Stop the program.

## Program

```java
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Exp7_Multithreading {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}


## Result

Thus, the Java program to implement multithreading by creating two threads using the `Thread` class was executed successfully.
