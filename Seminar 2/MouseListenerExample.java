/*
 * Author : Rishab.H
 * FileName : MouseListenerExample.java
 * Description :
            - This code is a demo to MouseListener in Java's awt
			- This code is a Standard Code
 */

import java.awt.* ;  
import java.awt.event.* ;
  
public class MouseListenerExample extends Frame implements MouseListener
{  
	Label l ;  

	MouseListenerExample () // Constructor
	{  
		addMouseListener (this) ;  
		addWindowListener (new WindowAdapter() 
		{    
            public void windowClosing (WindowEvent e) 
			{    
                dispose ();    
            }    
        }); 
		
        l = new Label () ; 
        l.setBounds (20, 50, 100, 20) ;  
        add (l) ;  
        setSize (300, 300) ;
        setLayout (null) ;
        setVisible (true) ;
    }
	
    public void mouseClicked (MouseEvent e) 
	{  
        l.setText ("Mouse Clicked") ;  
    } 
	
    public void mouseEntered (MouseEvent e) 
	{  
        l.setText ("Mouse Entered") ;  
    }  
	
    public void mouseExited (MouseEvent e) 
	{  
        l.setText ("Mouse Exited") ;  
    }  
	
    public void mousePressed (MouseEvent e) 
	{  
        l.setText ("Mouse Pressed") ;  
    }  
    public void mouseReleased (MouseEvent e) 
	{  
        l.setText ("Mouse Released") ;  
    }  
	
	public static void main (String [] array) 
	{  
		new MouseListenerExample () ;  
	}  
}  