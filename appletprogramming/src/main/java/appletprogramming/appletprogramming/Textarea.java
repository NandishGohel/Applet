package appletprogramming.appletprogramming;

import java.awt.*;
public class Textarea 
{
    Textarea()
    {
         Frame f=new Frame("Online....");
        TextArea area=new TextArea("Welcome to java");
        area.setBounds(30,40,200,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
     public static void main(String args[])
    {
        new Textarea();
    }
    
}