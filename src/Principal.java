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
	
	StartScreen start;
	IntroScreen intro;
	
	int pantalla = 0;
	
	@Override
	public void setup() {
		
		hero = new Heroe(250, 500, 100, 100, this);
		enemy1 = new Regular(100,50,50,50,1,this);
		start = new StartScreen(0, 0, this);
		intro = new IntroScreen(0, 0, this);
		
		
		
	}
	
	@Override
	public void draw() {
		background(255);	
		switch (pantalla) {
		case 0:
			start.pintar();
			break;
		case 1:
			intro.pintar();
			break;

		default:
			break;
		}
		
	}

	
	@Override
	public void keyPressed() {
		hero.mover(key);
		
	}
	
	@Override
	public void mousePressed() {
		//hero.disparar();
		switch (pantalla) {
		case 0:
			if (mouseX > (600 - (260 / 2))
					&& mouseX < (600 + (260 / 2))
					&& mouseY > (600 - (40 / 2))
					&& mouseY < (600 + (40 / 2))) {
				pantalla = 1;
			}
			if (dist(mouseX, mouseY, 1140, 640) < 50) {
				pantalla = 1;
			}
			break;
		case 1:
			if (mouseX > (600 - (260 / 2))
					&& mouseX < (600 + (260 / 2))
					&& mouseY > (600 - (40 / 2))
					&& mouseY < (600 + (40 / 2))) {
				pantalla = 1;
			}
			if (dist(mouseX, mouseY, 1140, 640) < 50) {
				pantalla = 1;
			}
			break;

		default:
			break;
		}
	}
	
	@Override
	public void mouseDragged() {
		
	}
	
	@Override
	public void mouseReleased() {
		
	}

	}


