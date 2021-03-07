import processing.core.PApplet;

public class Regular {
	
	private int x, y, w, h;
	private int vidas; // 0 muerte, 1 vivo
	private PApplet app;
	private boolean mov;
	

	public Regular(int x, int y, int w, int h, int vidas, PApplet app) {
		
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.vidas = 1;
		this.app = app;
		this.mov = true;
		
	}
	
	public void pintar() {
		app.fill(0,0,255);
		app.ellipse(x, y, w, h);
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
