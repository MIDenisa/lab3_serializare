package editor_grafic;

import java.awt.*;
import java.io.Serializable;

public class Circle extends Canvas implements Serializable {
	
	private int width;
	private int height;
	public Circle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

}
/*
*/