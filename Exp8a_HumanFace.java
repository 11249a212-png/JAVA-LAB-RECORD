# Experiment 8(a): Drawing a Human Face Using Applet

## Aim

To write a Java Applet program to draw a human face using graphics methods.

## Algorithm

1. Start the program.
2. Import the `java.applet.Applet`, `java.awt.Graphics`, and `java.awt.Color` packages.
3. Create a class `Exp8a_HumanFace` that extends the `Applet` class.
4. Override the `paint()` method.
5. Draw the face using `fillOval()`.
6. Draw the eyes, nose, mouth, ears, and hair using appropriate graphics methods.
7. Set different colors for the face, mouth, and other features.
8. Display the human face.
9. Stop the program.

## Program

```java
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Exp8a_HumanFace extends Applet {

    public void paint(Graphics g) {

        // Draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 200, 220);

        // Draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(145, 110, 20, 25);
        g.fillOval(235, 110, 20, 25);

        // Draw the nose
        g.drawLine(200, 130, 185, 165);
        g.drawLine(185, 165, 205, 165);

        // Draw the mouth
        g.setColor(Color.RED);
        g.drawArc(155, 170, 90, 45, 180, 180);

        // Draw the ears
        g.setColor(Color.YELLOW);
        g.fillOval(85, 125, 25, 50);
        g.fillOval(290, 125, 25, 50);

        // Draw the hair
        g.setColor(Color.BLACK);
        g.drawArc(110, 40, 180, 70, 0, 180);
    }
}
```

## Result

Thus, the Java Applet program to draw a human face using graphics methods was written successfully.
