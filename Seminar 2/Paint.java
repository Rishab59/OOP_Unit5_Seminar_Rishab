/*
 * Author : Rishab.H
 * FileName : Paint.java
 * Description : This code is to demonstrate MouseMotionListener in Java's awt
 */

import java.awt.*;  
import java.awt.event.* ;
import java.awt.event.MouseEvent;  
import java.awt.event.MouseMotionListener;  

public class Paint extends Frame implements MouseMotionListener
{  
    Label l ;  
    Color c = Color.BLUE ;  
    Paint() // Constructor
	{  
		addWindowListener (new WindowAdapter () 
		{    
            public void windowClosing (WindowEvent e) 
			{    
                dispose () ;    
            }    
        });    
		
		l = new Label () ;
		l.setBounds (20, 40, 100, 20) ;  
		add (l) ;  
      
		addMouseMotionListener (this) ;  
      
		setSize (400, 400) ;  
		setLayout (null) ;  
		setVisible (true) ;  
	}  

	public void mouseDragged(MouseEvent e) 
	{  
		l.setText ("X : " + e.getX () + " ,\tY : " + e.getY ()) ;  
		Graphics g = getGraphics () ;  
		g.setColor (Color.RED) ;  
		g.fillOval (e.getX(), e.getY(), 20, 20) ;  
	}  

	public void mouseMoved(MouseEvent e) 
	{  
		l.setText ("X : " + e.getX () + " ,\tY : " + e.getY ()) ;  
	}
	
	public static void main(String [] array) 
	{  
		new Paint () ;  
	}  
}  