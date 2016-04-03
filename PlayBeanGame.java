//U10416020
package beangame;

import java.security.SecureRandom;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.stage.Stage;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class PlayBeanGame extends Application{
    //Data field
    AllPane beanPane = new AllPane();
    SecureRandom random = new SecureRandom();
	
	//Override the start method in the application class
    @Override
    public void start(Stage primaryStage) {
        //Set mouse click
        beanPane.setOnMouseClicked(e -> {
            setBall();
        });
		
		//Create and set scene
        Scene scene = new Scene(beanPane, 500, 500);
        //Set stage
		primaryStage.setTitle("U10416020");
		primaryStage.setScene(scene);
		primaryStage.show();
    }    
    
	//Method to set a ball to play
    public void setBall(){
		//Create and set a circle with random color
        int x = 250, y = 80;
        double radius = 6.5;
        Circle circle = new Circle(x,y,radius);        
        int r = 1+random.nextInt(255);
        int g = 1+random.nextInt(255);
        int b = 1+random.nextInt(255);
        Color color = Color.rgb(r,g,b);
        circle.setFill(color);        
        beanPane.getChildren().add(circle);
		
		//Call playBall method
        playBall(circle, x, y);
    }
    
	//Method to set the path and display the animation
    public void playBall(Node circle, int x, int y){
        int newX = x, newY = y;
		
		//Create a path
        Path path = new Path();
		
		//Set the start point on path
        path.getElements().add(new MoveTo(newX, newY));
        newY += 30;
		
		//Set the line on path
        path.getElements().add(new LineTo(newX, newY));
        for(int i = 0; i < 7; i++){
            newY += 30;
            if(random.nextInt(2) == 0){
                newX += 20;
            }
            else{
                newX -= 20;
            }
            path.getElements().add(new LineTo(newX, newY));           
        }
        path.getElements().add(new LineTo(newX, newY+70));
		
		//Create a PathTransition
        PathTransition pt = new PathTransition();
		//Set duration, path, node, orientation, cyclecount, autoreverse
        pt.setDuration(Duration.millis(3000));
        pt.setPath(path);
        pt.setNode(circle);
        pt.setOrientation(OrientationType.NONE);       
        pt.setCycleCount(1);
        pt.setAutoReverse(false);
		
		//Display the path
        pt.play();        
    }
	
	//Main method
    public static void main(String[] args) {
        launch(args);
    }    
}
