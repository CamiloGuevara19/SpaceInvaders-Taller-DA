import processing.core.PApplet;

public class Principal extends PApplet{

	public static void main(String[] args) {
		PApplet.main("Principal");
	}
	
	@Override
	public void settings() {
		size(1200,700);
	}
	
	Heroe hero;
	Regular enemy1;
	
	@Override
	public void setup() {
		
		hero = new Heroe(250, 500, 50, 50, this);
		enemy1 = new Regular(100,50,50,50,1,this);
		
	}
	
	@Override
	public void draw() {
		background(255);	
		hero.pintar();
		enemy1.pintar();
	}

	
	@Override
	public void keyPressed() {
		hero.mover(key);
		
	}
	
	@Override
	public void mousePressed() {
		hero.disparar();
	}
	
	@Override
	public void mouseDragged() {
		
	}
	
	@Override
	public void mouseReleased() {
		
	}

	}


