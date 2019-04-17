package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot jeff = new Robot();
	for(int i = 0; i < 4 ; i++) {
		jeff.setSpeed(100);
		jeff.penDown();
		jeff.move(200);
		jeff.turn(90);
	}
	}
	}
	

