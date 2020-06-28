package appletprogramming.appletprogramming;
import java.awt.*;
import java.awt.event.*;
public class FrameButton extends Frame {
		public FrameButton()
		{
			Button btn= new Button("Hello World");
			add (btn);
			setSize(400, 500);
			setTitle("MR NG");
			setLayout(new FlowLayout());
			setVisible(true);
		}
		public static void main (String [] args)
		{
			FrameButton ta = new FrameButton();
		}
	}






