package appletprogramming.appletprogramming;

import java.applet.*;
import java.awt.*;
public class Arc extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.drawArc(150,100,100,200,150,100);
    }
    
}