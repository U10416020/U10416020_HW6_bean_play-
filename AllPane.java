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
        
        Line lineV[] = new Line[11];
		for(int i =0;i<9;i++){
				lineV[i] = new Line(90+i*40,400,90+i*40,320);
				lineV[i].setStrokeWidth(3);
				getChildren().add(lineV[i]);
        }	
        
        lineV[9] = new Line(230, 100, 230, 70);
        lineV[9].setStrokeWidth(3);
        lineV[10] = new Line(270, 100, 270, 70);        
        lineV[10].setStrokeWidth(3);
        
        Line lineS1 = new Line(90, 320, 230, 100);
        lineS1.setStrokeWidth(3);
	
        Line lineS2 = new Line(410, 320, 270, 100);
        lineS2.setStrokeWidth(3);       
		
        //Add all line to the pane
        getChildren().addAll(lineH, lineS1, lineS2,lineV[9],lineV[10]);
		
        //Create and set seven circle
		Circle circle7[] = new Circle[7];
		for(int i =0; i<7;i++){
			circle7[i] = new Circle(130+i*40,310,10);
			getChildren().add(circle7[i]);
		}
		
        //Create and set six circle
		Circle circle6[] = new Circle[6];
		for(int i =0; i<6;i++){
			circle6[i] = new Circle(150+i*40,280,10);
			getChildren().add(circle6[i]);
		}
			
		//Create and set five circle
		Circle circle5[] = new Circle[5];
		for(int i =0; i<5;i++){
			circle5[i] = new Circle(170+i*40,250,10);
			getChildren().add(circle5[i]);
		}
		
		//Create and set four circle
		Circle circle4[] = new Circle[4];
		for(int i =0; i<4;i++){
			circle4[i] = new Circle(190+i*40,220,10);
			getChildren().add(circle4[i]);
		}
		
		//Create and set three circle
		Circle circle3[] = new Circle[3];
		for(int i =0; i<3;i++){
			circle7[i] = new Circle(210+i*40,190,10);
			getChildren().add(circle7[i]);
		}
		
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

