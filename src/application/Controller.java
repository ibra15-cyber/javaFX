package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	@FXML
	private Circle myCircle;
	private double x;
	private double y;
	
	public void left(ActionEvent ae) {
//		System.out.println("UP");
		myCircle.setCenterX(x=x-3);
	}
	public void right(ActionEvent ae) {
//		System.out.println("LEFT");
		myCircle.setCenterX(x=x+3);
	}
	public void up(ActionEvent ae) {
//		System.out.println("RIGHT");
		myCircle.setCenterY(y=y-3);
	}
	public void down(ActionEvent ae) {
//		System.out.println("DOWN");
		myCircle.setCenterY(y=y+3);
	}
}
