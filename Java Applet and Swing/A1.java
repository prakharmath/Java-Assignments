import java.applet.*;
import java.awt.*;
import java.awt.Color;
/*
<applet code = "A1.class" width = 300 height = 300>
</applet>
*/
public class A1 extends Applet
{
    public void init()
    {
    	setBackground(Color.GREEN);
    }
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawString("Hello World",10,25);
	}
}