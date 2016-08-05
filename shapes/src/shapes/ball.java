package shapes;

import processing.core.PApplet;

public class ball extends PApplet{
	
	float xspeed;
	float yspeed;
	float x;
	float y;
	PApplet p;
	ball ball1;
	boolean game_in_prog = true;
	
	public ball(PApplet np, float tempX, float tempY, float tempvx, float tempvy) {
		p = np;
		x = tempX;
		y = tempY;
		xspeed = tempvx;
		yspeed = tempvy;
	}

		public void display(){
			p.fill(0,255,0);
			move();
			p.ellipse(x, y, 30, 30);
		}
		
		void move() {
			 x = x+xspeed;
			 y = y+yspeed;
			 if (y < 0 || y == 370 && x > p.mouseX && x < (p.mouseX + 55)) {
				 yspeed = -yspeed;
			 }
			 else if (y > 400 && game_in_prog) {
				 p.text("GameOver", 175,200);
			 }
			 if (x > 400 || x < 0) {
				 xspeed = -xspeed;
			 }
		}
	}
