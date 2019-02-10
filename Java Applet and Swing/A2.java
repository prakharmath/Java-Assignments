import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
/*
<applet code = "A2.class" width = 300 height = 300>
</applet>
*/
public class A2 extends Applet
{
	 public void init()
	 {
	 	 setSize(400,400);
	 	 repaint();
	 }
	 public void paint(Graphics g)
	 {
	 	g.setColor(Color.blue);
	 	g.drawRect(150,150,200,200);
	 	g.setColor(Color.red);
	 	g.drawString("Welcome",160,180);
	 }
}