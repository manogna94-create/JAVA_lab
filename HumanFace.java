import java.applet.*;
import java.awt.*;

/*
<applet code="HumanFace" width="400" height="400"></applet>
*/

public class HumanFace extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 200, 200);   // Face

        g.setColor(Color.BLACK);
        g.fillOval(150, 110, 20, 30);    // Left Eye
        g.fillOval(230, 110, 20, 30);    // Right Eye

        g.drawArc(160, 150, 80, 50, 0, -180); // Smile
        g.drawLine(200, 130, 200, 160);  // Nose
    }
}
