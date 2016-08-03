package shapes;

import processing.core.PApplet;

public class paddle extends PApplet {
	PApplet p;
	
	public paddle(PApplet pn){
		p = pn;
	}
	public void display() {
		p.fill(0,255,0);
		p.rect(p.mouseX, 370, 50, 20);
	}
}
 
