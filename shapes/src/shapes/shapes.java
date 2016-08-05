package shapes;

import java.util.ArrayList;

import processing.core.PApplet;

public class shapes extends PApplet {
	
	public static void main(String[] args) {
	PApplet.main("shapes.shapes");
	}
	ball ball1;
	paddle paddle1;
	ArrayList<brick> bricks = new ArrayList<brick>();
		public void settings() {
			size(400, 400);
		}
		public void setup() {
			ball1 = new ball(this, 200, 200, 3, 5);
			paddle1 = new paddle(this);
			background(0,0,0);
			noStroke();
			
			for(int i = 0; i < 8; i++) {
				bricks.add(new brick(this, i*50, 20));
			}
			for(int i = 0; i < 8; i++) {
				bricks.add(new brick(this, i*50, 60));
			}
			for(int i = 0; i < 8; i++) {
				bricks.add(new brick(this, i*50, 100));
			}
		}
		public void draw() {
			noStroke();
			fill(0,0,0,40);
			rect(0,0,width,height);
			fill(0,255,0);
			ball1.display();
			paddle1.display();
			for(int i = 0; i < bricks.size(); i++) {
				bricks.get(i).display();
				if (ball1.x >= bricks.get(i).x && ball1.x <= bricks.get(i).x+50 && bricks.get(i).y+35 >= ball1.y && bricks.get(i).y <= ball1.y) {
					ball1.yspeed = -ball1.yspeed;
					bricks.remove(i);
				}
			}
			if(bricks.size() == 0) {
				ball1.game_in_prog = false;
				text("You Won!",175,200);
			}
		}
	}
