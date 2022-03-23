package editor_grafic;

import java.awt.*;

public class Polygon extends Canvas {
	
		
	private int x[]= {12,23,45,50,60,65};
	private int y[]= {100,110,120,130,140,150};
	private int nr_of_points=6;
	    
	    // Constructor
	    public Polygon()
	    {
	        
	    }
	    
	    // Constructor with width and height
	    public Polygon( int x[], int y[], int nr_of_points )
	    {
	    	  this.x = x;
	          this.y = y;
	          this.nr_of_points=nr_of_points;
	    }
	    
	    public void paint(Graphics g2)
	    {
	    	g2.drawPolygon(x, y, nr_of_points);
	    }

}
/**/