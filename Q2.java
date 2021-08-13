/* Author:Nadezda Tsygankova
 * ID 152949194
 * Final Exam. 1 Task
 * Write a JavaFX application called (Q2.java in default package) to display the following Graphical User
Interface (GUI). No functionality is required
 * 
 * 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Q2 extends Application{
	
	 @Override 
	 public void start(Stage primarystage) {
		 //panel
		 Pane pane = new Pane();  
		 //circle for face
		 Circle circleFace = new Circle();
		 //locate circle in the center
		 circleFace.centerXProperty().bind(pane.widthProperty().divide(2)); //for pane
		 circleFace.centerYProperty().bind(pane.heightProperty().divide(2));//for pane
		 
		 //set radius for circle
		 circleFace.setRadius(80);
		 //border
		 circleFace.setStroke(Color.BLACK);
		 //color fill
		 circleFace.setFill(Color.WHITE);
		 //add circle into pane
		 pane.getChildren().add(circleFace);
		 

		 //for black eye create 2 ellipses
		 Ellipse ellipse3 = new Ellipse(180.0f,120.0f,25.0f,20.f);
		 ellipse3.setFill(Color.WHITE);
		 ellipse3.setStroke(Color.BLACK);
		 pane.getChildren().add(ellipse3);
		 
		 Ellipse ellipse4 = new Ellipse(120.0f,120.0f,25.0f,20.f);
		 ellipse4.setFill(Color.WHITE);
		 ellipse4.setStroke(Color.BLACK);
		 pane.getChildren().add(ellipse4);
		 
		 //around black create 2 ellipses
		 Ellipse ellipse = new Ellipse(180.0f,120.0f,14.0f,13.f);		 
		 pane.getChildren().add(ellipse);
		 Ellipse ellipse2 = new Ellipse(120.0f,120.0f,14.0f,13.f);
		 pane.getChildren().add(ellipse2);

		 
		 // create 3 line to draw a triangle 
		 Line line1 = new Line();
		 line1.setStartX(130.0f);
		 line1.setStartY(180.0f);
		 line1.setEndX(170.0f);
		 line1.setEndY(180.0f);
		 pane.getChildren().add(line1);
		 
		 
		 Line line2 = new Line();
		 line2.setStartX(130.0f);
		 line2.setStartY(180.0f);
		 line2.setEndX(150.0f);
		 line2.setEndY(140.0f);
		 pane.getChildren().add(line2);
		 
		 Line line3 = new Line();
		 line3.setStartX(170.0f);
		 line3.setStartY(180.0f);
		 line3.setEndX(150.0f);
		 line3.setEndY(140.0f);
		 pane.getChildren().add(line3);
		 
		 
		 //create arc for smile
		 Arc arc = new Arc(0.0f,50.0f,50.0f,50.0f,0.0f,110.0f);
		 //locate arc
		 arc.setTranslateX(133);
		 arc.setTranslateY(165);
		 //fill color white
		 arc.setFill(Color.WHITE);
		 //rotate
		 arc.setRotate(145);
		 //stroke
		 arc.setStroke(Color.BLACK);
		 pane.getChildren().add(arc);
		 //create scene
		 Scene scene = new Scene(pane, 300,300);
		 //title 
		 primarystage.setTitle("Smile");
		 primarystage.setScene(scene);
		 primarystage.show();
	 }

	 
	 public static void main (String args[]) {
		 Application.launch();
	 }
}

	
	
	


