package appletprogramming.appletprogramming;

import java.awt.*;

public class ButtonSetBound 
	{
	public static void main(String[] args)
	{
		Frame f1=new Frame("online Learn==> Button Demo");
		Button b1=new Button("HIT IT");
		b1.setBounds(150,200,80,100);
		f1.add(b1);
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	}
	