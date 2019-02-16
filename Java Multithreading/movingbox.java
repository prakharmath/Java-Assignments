import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
/*
<applet code = "movingbox.class" width = 300 height = 300>
</applet>
*/
public class movingbox extends Applet implements Runnable
{
	 Color c;
	 Font theFont=new Font("TimesRoman",Font.BOLD,100);
	 int x=100;
	 int y=100;
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
	 		 	update();
	 		 	Thread.sleep(200);
	 		 	c=Color.red;
	 		 	repaint();
	 		 	Thread.sleep(200);
	 		 	c=Color.cyan;
	 		 	repaint();
	 		 	Thread.sleep(200); 	
	 		 }
	 	}
	 	catch (Exception ex) 
	 	{
            ex.printStackTrace();
        }
	 }
	public void update()
   {
       x+=6;
       repaint();
    }
	public void paint(Graphics g)
	 {
	 	g.setColor(c);
	 	g.fillRect(x,y,500,500);
	 	g.setColor(Color.black);
	 	g.setFont(theFont);
	 	g.drawString("Hello",x+110,400);
	 }
}