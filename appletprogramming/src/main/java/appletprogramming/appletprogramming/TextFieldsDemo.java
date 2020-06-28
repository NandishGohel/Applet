package appletprogramming.appletprogramming;
import java.awt.*;
public class TextFieldsDemo
{
    public static void main(String args[])
    {
        Frame f1=new Frame("Online learn ==> TextField");
        TextField text1,text2;
        text1 =new TextField("Welcome to online learn");
        text1.setBounds(60,100,230,40);
        text2=new TextField("This tutorial is of java");
        text2.setBounds(60,150,230,40);
        
        f1.add(text1);
        f1.add(text2);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    
}