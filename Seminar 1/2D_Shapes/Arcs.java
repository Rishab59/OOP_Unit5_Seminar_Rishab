import java.awt.* ;
import java.applet.Applet ;

public class Arcs extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(10, 10, 60, 50, 0, 25) ;
		g.fillArc(100, 10, 60, 50, 0, 209) ;
		g.drawArc(190, 10, 60, 50, 0, 15) ;
		g.fillArc(70, 90, 140, 100, 0, 40) ;
		
		/*
		 * drawArc() has 6 parameters
		 * top, left, width, height, startAngle, sweepAngle
		 */
	}
}