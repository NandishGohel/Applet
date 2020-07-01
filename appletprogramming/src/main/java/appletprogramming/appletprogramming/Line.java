package appletprogramming.appletprogramming;

import java.applet.*;
import java.awt.*;
public class Line extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(20,30,40,100);
    }
    
}