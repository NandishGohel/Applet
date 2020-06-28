package appletprogramming.appletprogramming;
import java.awt.*;
public class CheckBox
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Online learn...");
        Checkbox ckbox1=new Checkbox("yes",true);
        ckbox1.setBounds(180,120,70,80);
        f.add(ckbox1);
        Checkbox ckbox2=new Checkbox("No");
        ckbox2.setBounds(150,100,60,60);
        f.add(ckbox2);
        f.setSize(300,300);
        f.setVisible(true);

    }
    
}