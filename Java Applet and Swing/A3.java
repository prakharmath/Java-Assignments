import java.applet.*;
import java.awt.*;
import java.awt.Color;
/*
<applet code = "A3.class" width = 300 height = 300>
</applet>
*/
public class A3 extends Applet
{
   public void paint(Graphics g)
   {
   	 for(int row=0;row<8;row++)
   	 {
   	 	 for(int col=0;col<8;col++)
   	 	 {
   	 	 	 if(row%2==col%2)
   	 	 	    g.setColor(Color.red);
   	 	 	else
   	 	 		g.setColor(Color.black);
   	 	 	g.fillRect(20*col,20*row,20,20);
   	 	 }
   	 }
   }
}