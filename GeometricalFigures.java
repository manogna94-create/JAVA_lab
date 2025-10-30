import java.applet.*;
import java.awt.*;

/*
<applet code="GeometricalFigures" width="400" height="400"></applet>
*/

public class GeometricalFigures extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 60);       // Rectangle

        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 100, 60);      // Oval

        g.setColor(Color.GREEN);
        g.drawLine(50, 150, 150, 250);     // Line

        g.setColor(Color.MAGENTA);
        g.drawRoundRect(200, 150, 100, 60, 20, 20); // Rounded Rectangle

        g.setColor(Color.ORANGE);
        g.fillRect(50, 270, 80, 50);       // Filled rectangle
    }
}
