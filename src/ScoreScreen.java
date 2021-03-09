import processing.core.PApplet;
import processing.core.PImage;

public class ScoreScreen {
	
	private int x, y;
	private PApplet app;
	PImage score;

	public ScoreScreen(int x, int y, PApplet app) {
		this.x = 0;
		this.y = 0;
		this.app = app;
		
		score = app.loadImage("score.jpg");
		app.rectMode(app.CENTER);
	}
	
	public void pintar() {
		app.rect(130, 620, 160, 60);
		app.rect(1069,620,160,60);
		app.image(score, 600, 350);
	}

}
