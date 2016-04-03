//U10416020
package beangame;

import javafx.scene.shape.*;
import javafx.scene.layout.Pane;

public  class AllPane extends Pane{
    //Constructor
    AllPane(){	
        //Create and set all line for bean game
        Line lineH = new Line(90, 400, 410, 400);		
        lineH.setStrokeWidth(3);
		
        Line lineV1 = new Line(90, 400, 90, 320);		
        lineV1.setStrokeWidth(3);
       
        Line lineV2 = new Line(130, 400, 130, 320);
        lineV2.setStrokeWidth(3);
        Line lineV3 = new Line(170, 400, 170, 320);
        lineV3.setStrokeWidth(3);
		
        Line lineV4 = new Line(210, 400, 210, 320);		
        lineV4.setStrokeWidth(3);
	
        Line lineV5 = new Line(250, 400, 250, 320);		
        lineV5.setStrokeWidth(3);
		
        Line lineV6 = new Line(290, 400, 290, 320);		
        lineV6.setStrokeWidth(3);
		
        Line lineV7 = new Line(330, 400, 330, 320);		
        lineV7.setStrokeWidth(3);
		
        Line lineV8 = new Line(370, 400, 370, 320);		
        lineV8.setStrokeWidth(3);
		
        Line lineV9 = new Line(410, 400, 410, 320);		
        lineV9.setStrokeWidth(3);

        Line lineS1 = new Line(90, 320, 230, 100);
        lineS1.setStrokeWidth(3);
	
        Line lineS2 = new Line(410, 320, 270, 100);
        lineS2.setStrokeWidth(3);
		
        Line lineV10 = new Line(230, 100, 230, 70);
        lineV10.setStrokeWidth(3);
		
        Line lineV11 = new Line(270, 100, 270, 70);
        lineV11.setStrokeWidth(3);
		
        //Add all line to the pane
        getChildren().addAll(lineH, lineV1, lineV2, lineV3, lineV4, lineV5, 
        lineV6, lineV7, lineV8, lineV9, lineS1, lineS2, lineV10, lineV11);
		
        //Create and set seven circle
        Circle circle7_1 = new Circle(130, 310, 10);
        Circle circle7_2 = new Circle(170, 310, 10);
        Circle circle7_3 = new Circle(210, 310, 10);
        Circle circle7_4 = new Circle(250, 310, 10);
        Circle circle7_5 = new Circle(290, 310, 10);
        Circle circle7_6 = new Circle(330, 310, 10);
        Circle circle7_7 = new Circle(370, 310, 10);
		
        //Add seven circle to the pane
        getChildren().addAll(circle7_1, circle7_2, circle7_3, circle7_4,
        circle7_5, circle7_6, circle7_7);
	
        //Create and set six circle
        Circle circle6_1 = new Circle(150, 280, 10);
        Circle circle6_2 = new Circle(190, 280, 10);
        Circle circle6_3 = new Circle(230, 280, 10);
        Circle circle6_4 = new Circle(270, 280, 10);
        Circle circle6_5 = new Circle(310, 280, 10);
        Circle circle6_6 = new Circle(350, 280, 10);    		
		
		//Add six circle to the pane
		getChildren().addAll(circle6_1, circle6_2, circle6_3, circle6_4, 
        circle6_5, circle6_6);		
		
		//Create and set five circle
		Circle circle5_1 = new Circle(170, 250, 10);
		Circle circle5_2 = new Circle(210, 250, 10);
		Circle circle5_3 = new Circle(250, 250, 10);
		Circle circle5_4 = new Circle(290, 250, 10);				
		Circle circle5_5 = new Circle(330, 250, 10);
	
        //Add five circle to the pane
		getChildren().addAll(circle5_1, circle5_2, circle5_3, circle5_4, circle5_5);
	
		//Create and set four circle
		Circle circle4_1 = new Circle(190, 220, 10);
		Circle circle4_2 = new Circle(230, 220, 10);
		Circle circle4_3 = new Circle(270, 220, 10);
		Circle circle4_4 = new Circle(310, 220, 10);			
		
		//Add four circle to the pane
		getChildren().addAll(circle4_1, circle4_2, circle4_3, circle4_4);
	
        //Create and set three circle
		Circle circle3_1 = new Circle(210, 190, 10);
		Circle circle3_2 = new Circle(250, 190, 10);
		Circle circle3_3 = new Circle(290, 190, 10);	
	
		//Add three circle to the pane
		getChildren().addAll(circle3_1, circle3_2, circle3_3);
        
		//Create and set two circle
		Circle circle2_1 = new Circle(230, 160, 10);
		Circle circle2_2 = new Circle(270, 160, 10);				
		
		//Add two circle to the pane
		getChildren().addAll(circle2_1, circle2_2);
	
        //Create and set one circle		
		Circle circle1 = new Circle(250, 130, 10);
		
		//Add the circle to the pane
		getChildren().add(circle1);	
    }
}		

