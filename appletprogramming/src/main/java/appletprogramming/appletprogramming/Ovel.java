package appletprogramming.appletprogramming;

import java.applet.*;
import java.awt.*;
public class Ovel extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawOval(60,70,90,150);
    }
    
}