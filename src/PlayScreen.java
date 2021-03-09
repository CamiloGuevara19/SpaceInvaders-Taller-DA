import java.awt.Font;
import java.util.ArrayList;


import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PlayScreen {
	
	private int x, y;
	private PApplet app;
	PImage juego;
	PImage grid;
	
	Heroe heroe;
	private ArrayList<Regular> regulares;
	
	PFont monument;
	
	
	int puntaje = 0;

	public PlayScreen(int x, int y, PApplet app) {
		this.x = 0;
		this.y = 0;
		this.app = app;
		
		juego = app.loadImage("juego.jpg");
		grid = app.loadImage("grid.png");
		
		heroe = new Heroe(425, 550, 100, 100, app);
		regulares = new ArrayList<Regular>();
		
		monument = app.createFont("MonumentExtended-Regular.otf", 60);
		
		app.frameRate(60);
		
	}
	
	public void pintar() {
		
		
		app.image(juego, 600, 350);
		
		app.fill(255);
		app.textFont(monument);
		app.textSize(25);
		app.textAlign(app.CENTER);
		app.text(puntaje, 1080, 229);
		app.text("00:00", 1045, 309);
		
		heroe.pintar();
		
		iniciarRegulars();
		Regulares();
		
		app.image(grid, 600, 350);
	}
	
	public void iniciarRegulars() {
		if(app.frameCount == 60) {
			int x = (int) app.random(75,775);
			int w = 50;
			int h = 50;
			regulares.add(new Regular(x,-50, w, h, 1, app));
			System.out.println(regulares.size());
			app.frameCount = 0;
		}
	}
	
	public void Regulares() { 
    	for (int i = 0; i < regulares.size(); i++) {
    		pintarRegulares(regulares.get(i));
			
			
		}
	}
	
	public void pintarRegulares(Regular regular) {
		regular.pintar();
	}
}
