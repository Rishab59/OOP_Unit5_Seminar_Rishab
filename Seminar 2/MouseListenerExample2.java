/*
 * Author : Rishab.H
 * FileName : MouseListenerExample2.java
 * Description :
            - This code is a demo to MouseListener in Java's awt
			- This code is a Standard Code
 */

import java.awt.* ;
import java.awt.event.* ;

public class MouseListenerExample2 extends Frame implements MouseListener
{  
    
	MouseListenerExample2 () //Constructor
	{  
        addMouseListener (this) ;
		addWindowListener (new WindowAdapter() 
		{    
            public void windowClosing (WindowEvent e) 
			{    
                dispose ();    
            }    
        });
        
        setSize(300, 300) ;
        setLayout(null) ;
        setVisible(true) ;
    }
	
    public void mouseClicked (MouseEvent e)
	{  
        Graphics g = getGraphics () ;
        g.setColor (Color.RED) ;
        g.fillOval (e.getX(), e.getY(), 30, 30) ;  
    }
	
	public void mouseEntered (MouseEvent e) {}  
    public void mouseExited (MouseEvent e) {}  
    public void mousePressed (MouseEvent e) {}  
    public void mouseReleased (MouseEvent e) {}  
	  
	public static void main (String [] array)
	{  
		new MouseListenerExample2 () ;  
	}  
}  