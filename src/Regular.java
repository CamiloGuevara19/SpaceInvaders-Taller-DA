import processing.core.PApplet;
import processing.core.PImage;

public class Regular {
	
	private int x, y, w, h;
	private int vidas; // 0 muerte, 1 vivo
	private PApplet app;
	private boolean mov;
	
	PImage regular;
	

	public Regular(int x, int y, int w, int h, int vidas, PApplet app) {
		
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.vidas = 1;
		this.app = app;
		this.mov = true;
		
		regular = app.loadImage("regular.png");
		app.imageMode(app.CENTER);
		
	}
	
	public void pintar() {
		
		app.image(regular, x, y, w, h);
		mover();
	}
	
	public void mover() {
		if(mov) {
			y += 2;
		}
		
	}
	
	boolean hitBala() {
		return false;
	}

}
