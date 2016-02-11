package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot savBot = new Robot ();		
for (int i = 0; i < 4; i++) {	
savBot.penDown();
savBot.move(200);
savBot.turn(90);
}	
	}
}