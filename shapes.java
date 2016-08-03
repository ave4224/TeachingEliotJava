package shapes;

import java.util.ArrayList;

import processing.core.PApplet;

public class shapes extends PApplet {
	
	public static void main(String[] args) {
	PApplet.main("shapes.shapes");
	}
	ball ball1;
	paddle paddle1;
	ArrayList<ball> b = new ArrayList<ball>();
		public void settings() {
			size(400, 400);
		}
		public void setup() {
			ball1 = new ball(this, 200, 50, 3, 5);
			paddle1 = new paddle(this);
			background(0,0,0);
			noStroke();
			
		}
		public void draw() {
			fill(0,0,0,40);
			rect(0,0,width,height);
			fill(0,255,0);
			ball1.display();
			paddle1.display();
			
		/*	for(int i = 0; 1 <20; i++) {
				b.add(new ball(this, 300, 2, 3));
			}*/
			
			
		}
	}
