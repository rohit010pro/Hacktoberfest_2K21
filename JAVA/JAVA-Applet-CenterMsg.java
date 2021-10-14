import java.applet.*;
import java.awt.*;
/*
	<applet code="MyAppletCenterMsg.class" width="500" height="500" ></applet>
*/

public class MyAppletCenterMsg extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome to SKJP",getWidth()/2-50,getHeight()/2);
		g.drawOval(getWidth()/2-50,getHeight()/2-50,100,100);
	}
}
