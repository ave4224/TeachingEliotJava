import processing.core.PApplet;

public class carsClass extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("carsClass");
	}
		float x;
		float y;
		Car car1;
		Car car2;
		Car car3;
		
		public void settings () {
			x = 200;
			y = 300;
			size (400,400);
		}
		public void  setup () {
			car1 = new Car(10,10);
			car2 = new Car(300,300);
			car3 = new Car(30,30);
		}
		public void draw () {
			background(255,255,255);
			car1.move();
			car2.move();
			car3.move();
			  car1.display();
			car2.display();
			car3.display();
			drive();
			display();
		}
		public void drive () {
			x = x + 2;
			if (x > width) {
				x = -30;
			}
		}
		public void display() {
			fill(255,0,0);
			rect(x,y,30,10);
			fill(0,0,0);
			ellipse(x+5,y+10, 5,5);
			ellipse(x+25,y+10, 5,5);
		}
		
		class Car{
			float x_pos;
			float y_pos;
			public Car(float tempX, float tempY) {
				x_pos = tempX;
				y_pos = tempY;
				
			}
			public void display () {
				fill(255,0,0);
				rect(x_pos,y_pos,30,10);
				fill(0,0,0);
				ellipse(x_pos+5,y_pos+10, 5,5);
				ellipse(x_pos+25,y_pos+10, 5,5);
			}
			public void move () {
				x_pos = x_pos + 2;
				if (x_pos > width) {
					x_pos = -30;
			}
		}
	}
}
		
		
		

