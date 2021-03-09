import processing.core.PApplet;
import processing.core.PImage;

public class Heroe {
	
	
	
	private int x, y, lx, ly;
	private int dir; // 0 quieto, 1 derecha, 2 izquierda
	private boolean mov;
	private PApplet app;
	
	Bullet bullet;
	
	PImage player;
	

	public Heroe(int x, int y, int lx, int ly, PApplet app) {
		this.x = x;
		this.y = y;
		this.lx = lx;
		this.ly = ly;
		this.dir = 0;
		this.mov = true;
		this.app = app;
		
		player = app.loadImage("player.png");
		app.imageMode(app.CENTER);
	}
	
	public void pintar() {
		app.image(player, x, y, lx, ly);
		
		if(bullet != null) {
			bullet.pintar();
		}
		
		
	}
	
	public void mover(int key) {
		switch (key) {
		case 'a':
			dir = 1;
			if (mov == true && dir == 1){
				x-= 10;
			}
			break;
        case 'd':
        	dir = 2;
        	if(mov == true && dir == 2) {
        		x+= 10;
        	}
			break;

		default:
			break;
		}
	}
	
	public void disparar() {
		bullet = new Bullet(x, y, app);
	}

}
