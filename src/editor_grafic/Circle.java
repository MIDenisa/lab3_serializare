package editor_grafic;

import java.awt.*;

public class Circle extends Canvas {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int width;
	int height;
	
	//Constructor
	public Circle()
	{
	}
	
	//Constructor with width and height
	public Circle(int x, int y)
	{
		width=x;
		height=y;
	}
	
	public void paint(Graphics g2) {
		
		int x, y;
        
        // Draws a border
        int h = getSize().height;
        int w = getSize().width;
        g2.drawRect( 0, 0, w - 1, h - 1 );
        
        // Randomizes the x and y components
        x = ( int )( Math.random() * ( w - 200 ) );
        y = ( int )( Math.random() * ( h - 200 ) );
        
        // Draws the circle
        g2.fillOval( x, y, width, height );
	}

}
/*
*/