package editor_grafic;


import java.awt.*;

public class Line extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
    int y;
    
    // Constructor
    public Line()
    {
        
    }
    
    
    // Constructor with width and height
    public Line( int x, int y )
    {
        this.x = x;
        this.y = y;
    }
    
    // Paint method
    public void paint( Graphics g2 )
    {   
        // Draws a border
        g2.drawLine( 0, 0, x, y );
    }
}
/**/