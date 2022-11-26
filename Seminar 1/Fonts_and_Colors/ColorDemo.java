import java.awt.* ;
import java.applet.* ;

public class ColorDemo extends Applet
{
	public void paint(Graphics g)
	{
		Color c1 = new Color(255, 100, 100) ;
		Color c2 = new Color(100, 255, 100) ;
		Color c3 = new Color(100, 100, 255) ;
		
		/*
		 * Color is a built-in class
		 * The parameters that are are passed to the 
		 * Color class is actually the RGB value 
		 * of the color that user wants
		 */
		
		g.setColor(c1) ;
		g.drawLine(0, 0, 100, 100) ;
		g.drawLine(0, 100, 100, 0) ;
		
		g.setColor(c2) ;
		g.drawOval(45, 20, 200, 101) ;
		g.drawOval(75, 10, 90, 80) ;
		
		g.setColor(c3) ;
		g.drawLine(70, 50, 46, 35) ;
		g.drawLine(56, 9, 87, 47) ;
		
		g.setColor(Color.red) ;
		g.drawLine(195, 154, 14, 31) ;
		g.drawLine(345, 400, 300, 0) ;
		
		g.setColor(Color.blue) ;
		g.drawLine(42, 78, 254, 150) ;
		g.drawLine(12, 14, 105, 159) ;
	}
}