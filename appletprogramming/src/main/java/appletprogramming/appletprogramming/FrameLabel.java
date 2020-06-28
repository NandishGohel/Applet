package appletprogramming.appletprogramming;
import java.awt.*;
public class FrameLabel {
	FrameLabel()
	{
		Frame fm=new Frame();
		Label lb= new Label("welcome to java graphics");
		fm.add(lb);
		fm.setSize(800, 300);
		fm.setVisible(true);
	}
	public static void main(String args [])
	{
		FrameLabel ta = new FrameLabel();
	}
}

