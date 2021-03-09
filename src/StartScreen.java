import processing.core.PApplet;
import processing.core.PImage;

public class StartScreen {
	
	private int x, y;
	private PApplet app;
	PImage start;

	public StartScreen(int x, int y, PApplet app) {
		this.x = 0;
		this.y = 0;
		this.app = app;
		
		start = app.loadImage("start.jpg");
		app.rectMode(app.CENTER);
		app.ellipseMode(app.CENTER);
		
	}
	
	public void pintar() {
		app.rect(600, 600, 260, 40);
		app.ellipse(1140, 640, 100, 100);
		app.image(start, 600, 350);
	}

}
