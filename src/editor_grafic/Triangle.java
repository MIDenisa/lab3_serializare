package editor_grafic;

import java.awt.*;
public class Triangle extends Canvas {
	
	private int x[];
	private int y[];
	private int nr_of_points;
	
	public Triangle()
	{
	}
	
	public Triangle( int x[], int y[], int nr_of_points )
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
