package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Caleb = new Robot();
	Caleb.penDown();
	Caleb.setPenColor(255,0,0);
	Caleb.setSpeed(11);
	for (int i = 0; i <400; i++) {
		Caleb.turn(90);	
	Caleb.move(200);
	Caleb.turn(90);	
	Caleb.move(200);
	Caleb.turn(90);
	Caleb.move(200);
	Caleb.turn(90);


	}
 	 
	
	
	
	
	
	
	
	
	
	}
}


