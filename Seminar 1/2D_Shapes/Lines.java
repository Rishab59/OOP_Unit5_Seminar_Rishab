import java.awt.* ;
import java.applet.* ;

/*
 *it does not work if we give
 *class Lines extends Applet
 *public keyword has to be used to embed java code with html
 */
 
public class Lines extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,100,100) ;
		g.drawLine(347,290,59,100) ;
		g.drawLine(312,90,80,180) ;
		g.drawLine(349,20,159,200) ;
		
		/*
		 * drawLine() has 4 parameters
		 * top, left, width, height
		 */
	}
}