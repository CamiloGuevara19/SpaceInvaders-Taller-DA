import processing.core.PApplet;
import processing.core.PImage;

public class IntroScreen {
	
	private int x, y;
	private PApplet app;
	PImage intro;

	public IntroScreen(int x, int y, PApplet app) {
		this.x = 0;
		this.y = 0;
		this.app = app;
		
		intro = app.loadImage("intro.jpg");
		app.rectMode(app.CENTER);
		
	}
	
	public void pintar() {
		app.image(intro, 600, 350);
		app.rect(130, 620, 160, 60);
		app.rect(1069,620,160,60);
		//app.image(intro, 600, 350);
	}

}
