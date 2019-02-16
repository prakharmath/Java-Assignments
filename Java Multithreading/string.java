import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
/*
<applet code = "string.class" width = 300 height = 300>
</applet>
*/
public class string extends Applet implements Runnable
{
	 Color c;
	 public void init()
	 {
	 	 setSize(400,400);
	 	 repaint();
	 	 Thread th=new Thread(this);
	 	 th.start();
	 }
	 public void run()
	 {
	 	try
	 	{
	 		 while(true)
	 		 {
	 		 	c=Color.red;
	 		 	repaint();
	 		 	Thread.sleep(1000);
	 		 	c=Color.blue;
	 		 	repaint();
	 		 	Thread.sleep(1000);
	 		 }
	 	}
	 	catch (Exception ex) 
	 	{
            ex.printStackTrace();
        }
	 }
	public void update(Graphics g) {
        paint(g);
    }
	public void paint(Graphics g)
	 {
	 	g.setColor(c);
	 	g.drawString("Welcome",200,200);
	 }
}