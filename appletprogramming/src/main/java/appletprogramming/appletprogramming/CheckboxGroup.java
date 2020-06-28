package appletprogramming.appletprogramming;

import java.awt.*;
public class CheckboxGroup 
{
    CheckboxGroup()
    {
        Frame f= new Frame("CheckboxGroup Example");    
        java.awt.CheckboxGroup obj = new java.awt.CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("Yes", obj, false);    
        checkBox1.setBounds(100,100, 50,50);    
        Checkbox checkBox2 = new Checkbox("No", obj, true);    
        checkBox2.setBounds(100,150, 50,50);    
        f.add(checkBox1);    
        f.add(checkBox2);    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);  

    }
    public static void main(String args[])
    {
        new CheckboxGroup();
    }
    
}