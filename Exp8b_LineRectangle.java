# Experiment 8(b): Drawing Shapes Using Applet

## Aim

To write a Java Applet program to draw a line, rectangle, cross, rounded rectangle, and filled rectangle using graphics methods.

## Algorithm

1. Start the program.
2. Import the `java.applet.Applet` and `java.awt.Graphics` packages.
3. Create a class named `Exp8b_Shapes` that extends the `Applet` class.
4. Override the `paint()` method.
5. Use `drawLine()` to draw a line.
6. Use `drawRect()` to draw a rectangle.
7. Use two intersecting lines to draw a cross.
8. Use `drawRoundRect()` to draw a rounded rectangle.
9. Use `fillRect()` to draw a filled rectangle.
10. Display all the shapes in the applet window.
11. Stop the program.

## Program

```java
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Exp8b_Shapes extends Applet {

    public void paint(Graphics g) {

        // Draw a line
        g.drawLine(50, 40, 200, 40);

        // Draw a rectangle
        g.drawRect(50, 70, 150, 60);

        // Draw a cross
        g.drawLine(250, 70, 310, 130);
        g.drawLine(310, 70, 250, 130);

        // Draw a rounded rectangle
        g.drawRoundRect(50, 160, 150, 60, 20, 20);

        // Draw a filled rectangle
        g.setColor(Color.BLUE);
        g.fillRect(250, 160, 150, 60);
    }
}
```

## Result

Thus, the Java Applet program to draw a line, rectangle, cross, rounded rectangle, and filled rectangle using graphics methods was written successfully.
