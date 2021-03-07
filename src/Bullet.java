import processing.core.PApplet;

public class Bullet {
	
	private int x, y;
	private boolean mov;
	private PApplet app;
	

	public Bullet(int x, int y, PApplet app) {
		
		this.x = x;
		this.y = y;
		this.app = app;
		this.mov = true;
		
		
	}
	
	public void pintar() {
		
		app.ellipse(x, y, 10, 10);
		mover();
		
	}
	
	public void mover() {
		if(mov) {
			y-=5;
		}
		
		
	}

}
