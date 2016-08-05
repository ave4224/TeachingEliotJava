package shapes;

import processing.core.PApplet;

public class brick extends PApplet {

	PApplet p;
	int x;
	int y;
	
	public brick(PApplet pn,int x_pos, int y_pos) {
		
		p = pn;
		x = x_pos;
		y = y_pos;
		
	}
	
	public void display() {
		p.stroke(5);
		p.fill(150,79,240);
		p.rect(x,y,50,35);
		
	}
	
	
}
