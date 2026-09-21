import java.awt.*;
import java.applet.*;

@SuppressWarnings("removal")
public class X901M extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawString("A Simple Applet", 50, 70);
    }

    // Simple main method so you can run it directly
    public static void main(String[] args) {
        Frame f = new Frame("My Applet Window");
        X901M a = new X901M();

        f.add(a);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}

