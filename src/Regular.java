import processing.core.PApplet;
import processing.core.PImage;

public class Regular {
	
	protected int x;
	protected int y;
	protected int w;
	protected int h;
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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public boolean isMov() {
		return mov;
	}

	public void setMov(boolean mov) {
		this.mov = mov;
	}
	
	boolean hitBala() {
		return false;
	}

}
