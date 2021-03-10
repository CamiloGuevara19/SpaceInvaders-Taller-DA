import processing.core.PApplet;
import processing.core.PImage;

public class Advanced extends Regular {
	
	private PApplet app;
	PImage advent;
	private boolean mov;

	public Advanced(int x, int y, int w, int h, int vidas, PApplet app) {
		super(x, y, w, h, vidas, app);
		
		this.mov = true;
		
		advent = app.loadImage("advent.png");
		app.imageMode(app.CENTER);
		
	}
	
        public void pintar() {
		
		app.image(regular, x, y, w, h);
		mover();
	}
        
        public void mover() {
    		if(mov) {
    			y += 4;
    		}
        }
        
        boolean hitBala() {
    		return false;
    	}
}
