package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot savBot= new Robot();
		// 5. Set your robot's pen to the down position
            savBot.penDown();
		
           savBot.setSpeed(10);
		
for (int i = 0; i < 75; i++) {
	

			// 7. Change the pen color to random
	savBot.setRandomPenColor();
			
	savBot.move(5*i);
			
	savBot.turn(360/6);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
}
	}
}
