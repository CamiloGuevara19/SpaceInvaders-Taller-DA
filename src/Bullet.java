import processing.core.PApplet;
import processing.core.PImage;

public class Bullet {
	
	private int x, y;
	private boolean mov;
	private PApplet app;
	
	PImage bullet;
	

	public Bullet(int x, int y, PApplet app) {
		
		this.x = x;
		this.y = y;
		this.app = app;
		this.mov = true;
		
		bullet = app.loadImage("bullet.png");
		app.imageMode(app.CENTER);
		
		
	}
	
	public void pintar() {
		
		app.image(bullet, x, y, 15, 15);
		mover();
		
	}
	
	public void mover() {
		if(mov) {
			y-=5;
		}
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isMov() {
		return mov;
	}

	public void setMov(boolean mov) {
		this.mov = mov;
	}
	
	

}
