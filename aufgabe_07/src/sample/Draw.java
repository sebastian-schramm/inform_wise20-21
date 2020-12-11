package sample;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;

@SuppressWarnings("unused")
public class Draw {
	
	private double frameWidth;
	private double frameHeight;

	private float currentX;
	private float currentY;
	private int direction;
	
	private boolean isDrawing;
	
	BorderPane root; 

	public Draw(Scene scene) {
		frameWidth = scene.getWidth();
		frameHeight = scene.getWidth();

		currentX = 0.0f;
		currentY = 0.0f;
		direction = 0;
		
		isDrawing = false;
		root = (BorderPane) scene.getRoot();
	}
	
	public void up() {isDrawing = false;}
	
	public void down() {isDrawing = true;}
	
	public void move(double length) {
		float newY;
		float newX;

		newY = (float) (currentY + length * Math.sin(Math.toRadians(direction)));
		newX = (float) (currentX + length * Math.cos(Math.toRadians(direction)));
		
		if (isDrawing) {
			Line line = new Line(currentX, currentY, newX, newY);
			root.getChildren().addAll(line);
		}
		
		currentY = newY;
		currentX = newX;
		
	}
	
	public void turn(int direction) {this.direction += direction;}

}
