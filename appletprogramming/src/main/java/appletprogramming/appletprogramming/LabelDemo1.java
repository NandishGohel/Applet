package appletprogramming.appletprogramming;

import java.awt.*;

 class LabelDemo1 
	{
	public static void main(String args[])
	{
		Frame f1=new Frame("online learn ==> Label Demo");
		Label lab3, lab2;
		lab3 = new Label("Welcome to onlinelearn.com");
		lab3.setBounds(50,50,200,30);
		lab2= new Label("This Tutorial is of Java");
		lab2.setBounds(50,100,200,30);
		f1.add(lab3);
		f1.add(lab2);
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}

}
