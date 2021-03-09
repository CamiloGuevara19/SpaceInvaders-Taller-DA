import processing.core.PApplet;
import processing.core.PImage;

public class PlayScreen {
	
	private int x, y;
	private PApplet app;
	PImage juego;

	public PlayScreen(int x, int y, PApplet app) {
		this.x = 0;
		this.y = 0;
		this.app = app;
		
		juego = app.loadImage("juego.jpg");
		
	}
	
	public void pintar() {
		
		
		app.image(juego, 600, 350);
	}

}
