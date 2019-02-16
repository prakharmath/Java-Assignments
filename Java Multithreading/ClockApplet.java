import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.lang.Math;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.awt.Graphics;
import java.awt.Font;
import java.util.Date;
import java.applet.*;
/*
<applet code="ClockApplet" width="250" height="200">
</applet>*/
public class ClockApplet extends Applet implements Runnable
{
	Font theFont=new Font("TimesRoman",Font.BOLD,24);
	Date theDate;
	Thread runner;
	public void start()
	{
		 if(runner==null)
		 {
		 	 runner=new Thread(this);
		 	 runner.start();
		 }
	}
	public void stop()
	{
		 if(runner!=null)
		 {
		 	runner.stop();
		 	runner=null;
		 }
	}
	public void run()
	{
		 while(true)
		 {
		 	 theDate=new Date();
		 	 repaint();
		 	 try
		 	 {
		 	 	Thread.sleep(1000);
		 	 }
		 	 catch(InterruptedException e)
		 	 {

		 	 }
		 }
	}
	public void paint(Graphics g)
	{
		 g.setFont(theFont);
		 g.drawString(theDate.toString(),10,50);
	}
}