package sample;

public class zweiKonzentrischeQuadrate {
	private Draw draw;
	private int length = 200;
	private int anzahlQuadrate = 2;

	public zweiKonzentrischeQuadrate(Draw draw) {
		this.draw = draw;
//		print();
		print2();
	}
	
	private void print2() {
		for (int i = 0; i < anzahlQuadrate; ++i) {
			for (int n = 0; n < 2; ++n) {
				draw.turn((n % 2) != 0 ? -90 : 90);
				draw.move(length / 2);
			}
			draw.down();
			for (int n = 0; n < 4; ++n) {
				draw.move(length);
				draw.turn(90);
			}
			draw.up();
			length /= 2;
		}
	}

	private void print() {
		draw.turn(90);
		draw.move(250);
		draw.turn(-90);
		draw.move(150);
		draw.turn(-90);
		for (int i = 0; i < 4; ++i) {
			draw.down();
			draw.move(150);
			draw.turn(90);
			draw.move(100);
			draw.turn(90);
			draw.move(50);
			draw.up();
			draw.move(100);
			draw.turn(90);
		}
	}

}
